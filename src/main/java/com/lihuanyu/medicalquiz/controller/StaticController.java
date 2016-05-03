package com.lihuanyu.medicalquiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by skyADMIN on 16/5/3.
 */
@Controller
public class StaticController {

    @RequestMapping("/about")
    public String showAboutPage(){
        return "about";
    }

    @RequestMapping("/help")
    public String showHelpPage(){
        return "help";
    }
}
