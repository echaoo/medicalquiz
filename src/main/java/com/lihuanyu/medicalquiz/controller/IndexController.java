package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.services.CreateMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by echao on 2016/3/5.
 */
@Controller
public class IndexController {

    @Autowired
    private CreateMessage createMessage;

    @RequestMapping(value = "/savenew",method = RequestMethod.POST)
    public String saveNew(int admissionnum,String name,int age,String number,char sex,String birth){
        createMessage.saveMessage(admissionnum,name,age,number,sex,birth);
        return "basicinfoform";
    }

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/new")
    public String showReg(){
        return "regpage";
    }

}
