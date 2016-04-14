package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.model.BasicInfo;
import com.lihuanyu.medicalquiz.model.BasicInfoDao;
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
    private HttpSession httpSession;

    @Autowired
    private BasicInfoDao basicInfoDao;

    @RequestMapping(value = "/usercenter",method = RequestMethod.GET)
    public String showUserCenter(){
        if (httpSession.getAttribute("phone")!=null) {

            return "personal";
        }else{
            return "index";
        }
    }

    @RequestMapping(value = "/usercenter",method = RequestMethod.POST)
    public String showUserCenter(String name, String phone, Model model){
        BasicInfo basicInfo = basicInfoDao.findByPhonenumber(phone);
        httpSession.setAttribute("phone",phone);
        httpSession.setAttribute("userid",basicInfo.getId());
        int id = basicInfo.getId();

        return "personal";
    }

}
