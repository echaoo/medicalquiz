package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.model.*;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by echao on 2016/3/5.
 */
@Controller
public class IndexController {

    @RequestMapping("/changeinfo")
    public String changeInfo(){ return "regpage"; }

    @RequestMapping("/")
    public String showIndex() { return "index"; }
}
