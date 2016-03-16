package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.model.*;
import com.lihuanyu.medicalquiz.services.CreateMessage;
import com.lihuanyu.medicalquiz.services.CreateTest;
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

    @RequestMapping(value = "/savemmsetest", method = RequestMethod.POST)
    public String saveMmseTest() {
        return "finishtest";
    }

    @RequestMapping(value = "/savedatum", method = RequestMethod.POST)
    public String saveDatum() {
        return "mmsetest";
    }

    @RequestMapping(value = "/savenew", method = RequestMethod.POST)
    public String saveNew() {
        return "datumtest";
    }

    @RequestMapping("/regnew")
    public String showReg() {
        return "regpage";
    }

    @RequestMapping("/usercenter")
    public String showUserCenter(){ return "personal"; }

    @RequestMapping("/")
    public String showIndex() { return "index"; }
}
