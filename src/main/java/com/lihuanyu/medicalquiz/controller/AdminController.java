package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Collection;

/**
 * Created by echao on 2016/3/6.
 */
@Controller
public class AdminController {

    @Autowired
    private TestInfoDao testInfoDao;

    @Autowired
    private HttpSession httpSession;

    @RequestMapping("/admin")
    public String showLogin() {
        return "loginadmin";
    }

    @RequestMapping(value = "/adminlogin", method = RequestMethod.POST)
    public String login(String username, String password, Model model) {
        if (username.equals("admin") && password.equals("admin")) {
            //Iterable<Participator> participators = participatorDao.findAll();
            //model.addAttribute("adminLists", participators);
            httpSession.setAttribute("adminlogin","true");
            return "redirect:/adminpanel";
        } else {
            String result = "出错了！";
            String word = "账号或密码有误";
            model.addAttribute("title", result);
            model.addAttribute("word", word);
            return "message";
        }
    }

    @RequestMapping("/adminpanel")
    public String adminPanel(Model model, String action){
        if (httpSession.getAttribute("adminlogin") == null){
            return "loginadmin";
        }else {
            Iterable<TestInfo> testInfos = testInfoDao.findAll();
            model.addAttribute("testInfos",testInfos);
            return "admin";
        }
    }

    @RequestMapping("/detail")
    public String showDetail(int admissionnum, int admnum, int number, Model model) {
        //Collection<Participator> participator = participatorDao.findByAdmissionnum(admissionnum);
        //model.addAttribute("participator", participator);
        //Collection<Datum> datum = datumDao.findByAdmnum(admnum);
        //model.addAttribute("datum", datum);
        return "detail";//显示整张调查表的内容和结果
    }

}
