package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by echao on 2016/3/5.
 */
@Controller
public class IndexController {

    @Autowired
    private BasicInfoDao basicInfoDao;

    @Autowired
    private HttpSession httpSession;

    @RequestMapping("/changeinfo")
    public String changeInfo(){ return "regpage"; }


    @RequestMapping(value = "/usercenter",method = RequestMethod.POST)
    public String showUserCenter(String name, String phone){
        BasicInfo basicInfo = basicInfoDao.findByPhonenumber(phone);
        httpSession.setAttribute("phone",phone);
        int id = basicInfo.getId();

        return "personal";
    }

    @RequestMapping("/")
    public String showIndex() { return "index"; }
}
