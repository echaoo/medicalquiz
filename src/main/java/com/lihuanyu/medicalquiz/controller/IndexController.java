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
    private HttpSession httpSession;

    @Autowired
    private BasicInfoDao basicInfoDao;

    @Autowired
    private DatumDao datumDao;

    @RequestMapping(value = "/savemmsetest",method = RequestMethod.POST)
    public String saveMmseTest(){

        return "finishtest";
    }

    @RequestMapping(value = "/savedatum",method = RequestMethod.POST)
    public String saveDatum(int ques1,int ques2,int ques3,int ques4){
        int adminnum = (int) httpSession.getAttribute("adminnum");
        Datum datum = new Datum();
        datum.setAdmnum(adminnum);
        datum.setFour1(ques1);
        datum.setFour2(ques2);
        datum.setFour3(ques3);
        datum.setFour4(ques4);
        int score = ques1 + ques2 + ques3 + ques4;
        datum.setScore(score);
        datumDao.save(datum);
        if (score > 2){
            return "finishtest";
        }else {
            return "mmsetest";
        }
    }

    @RequestMapping(value = "/savebasic",method = RequestMethod.POST)
    public String saveBasicinform(String education,String occupation,String married ){
        int adminnum = (int) httpSession.getAttribute("adminnum");
        BasicInfo basicInfo = new BasicInfo();
        basicInfo.setAdminnum(adminnum);
        basicInfo.setEducation(education);
        basicInfo.setOccupation(occupation);
        basicInfo.setMarital(married);
        basicInfoDao.save(basicInfo);
        return "datumtest";
    }

    @RequestMapping(value = "/savenew",method = RequestMethod.POST)
    public String saveNew(int admissionnum,String name,int age,String number,char sex,String birth){
        createMessage.saveMessage(admissionnum,name,age,number,sex,birth);
        httpSession.setAttribute("adminnum",admissionnum);
        return "basicinfoform";
    }

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/regnew")
    public String showReg(){
        return "regpage";
    }
}
