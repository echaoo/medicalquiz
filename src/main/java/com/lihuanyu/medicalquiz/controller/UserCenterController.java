package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.model.BasicInfo;
import com.lihuanyu.medicalquiz.model.BasicInfoDao;
import com.lihuanyu.medicalquiz.services.UserCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by skyADMIN on 16/4/14.
 */
@Controller
public class UserCenterController {

    @Autowired
    private UserCenterService userCenterService;

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private BasicInfoDao basicInfoDao;

    @RequestMapping("/changeinfo")
    public String changeUserInfo(){
        if (httpSession.getAttribute("userid") == null) {
            return "index";
        }
        return "changeinfo";
    }

    @RequestMapping(value = "/usercenter", method = RequestMethod.GET)
    public String showUserCenter(Model model) {
        if (httpSession.getAttribute("phone") != null) {
            int id = (int) httpSession.getAttribute("userid");
            userCenterService.showMessage(id, model);
            return "personal";
        } else {
            return "index";
        }
    }

    @RequestMapping(value = "/usercenter", method = RequestMethod.POST)
    public String showUserCenter(String name, String phone, Model model) {
        BasicInfo basicInfo = basicInfoDao.findByPhonenumberAndName(phone, name);
        if (basicInfo == null){
            model.addAttribute("hint","电话与姓名不匹配或未注册,请重试");
            return "index";
        }
        httpSession.setAttribute("phone", phone);
        httpSession.setAttribute("userid", basicInfo.getId());
        int id = basicInfo.getId();
        userCenterService.showMessage(id, model);
        return "personal";
    }

}
