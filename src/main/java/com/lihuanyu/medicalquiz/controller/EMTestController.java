package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.services.EMTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by skyADMIN on 16/4/14.
 */
@Controller
public class EMTestController {

    @Autowired
    private EMTestService emTestService;

    @Autowired
    private HttpSession httpSession;

    @RequestMapping("/emtest")
    public String showEmTest() {
        if (httpSession.getAttribute("userid") != null) {
            return "emtest";
        } else {
            return "index";
        }
    }

    @RequestMapping(value = "/saveemtest1", method = RequestMethod.POST)
    public String dealemtest1(String correct, String time) {
        emTestService.dealemtest1(correct, time);
        return "index";//无意义,此处用ajax提交的表单,返回index只是为了不报错
    }

    @RequestMapping(value = "/saveemtest2", method = RequestMethod.POST)
    public String dealemtest2(String correct, String time) {
        emTestService.dealemtest2(correct, time);
        return "index";
    }
}
