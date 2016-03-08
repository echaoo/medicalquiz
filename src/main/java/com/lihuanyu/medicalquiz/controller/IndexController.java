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

    @Autowired
    private CreateMessage createMessage;

    @Autowired
    private CreateTest createTest;

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private BaicInfoDao baicInfoDao;

    @RequestMapping(value = "basicinfoform",method = RequestMethod.POST)
    public String saveBasicinform(String education,String occupation,String married ){
        int adminnum = (int) httpSession.getAttribute("adminnum");
        BaicInfo baicInfo = new BaicInfo();
        baicInfo.setAdminnum(adminnum);
        baicInfoDao.save(baicInfo);
        createTest.saveTest(education,occupation,married);
        return "testfour";
    }

    @RequestMapping(value = "/savenew",method = RequestMethod.POST)
    public String saveNew(int admissionnum,String name,int age,String number,char sex,String birth){
        createMessage.saveMessage(admissionnum,name,age,number,sex,birth);
        Participator participator = new Participator();
        httpSession.setAttribute("id",participator.getId());
        httpSession.setAttribute("adminnum",participator.getAdmissionnum());
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
