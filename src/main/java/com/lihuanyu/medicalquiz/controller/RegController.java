package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.model.BasicInfo;
import com.lihuanyu.medicalquiz.model.BasicInfoDao;
import com.lihuanyu.medicalquiz.services.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by skyADMIN on 16/4/14.
 */
@Controller
public class RegController {

    @Autowired
    private RegService regService;

    @RequestMapping(value = "/savenew",method = RequestMethod.POST)
    public String dealReg(String phone, String name, String sex, String age, String number, String birth, String education, String occupation, String marital, String wherelive, String live, String hypertension, String hypertensiontime, String hypertionsion, String diabetes, String diabetestime, String hyperlipemia, String hyperlipemiatime, String LDLC, String HDLC, String TC, String TG, String angiocardiopathy, String heartpaintime, String myocardial, String AF, String ACVD, String headblood, String chocke, String headchocke, String TIA, String headhurt, String illposition, String illlevel, String drinkstate, String smoke, String isdrinktea, String sleepstate, String PEstate, String socialstate, String hobby, String eathabits){

        if (!regService.checkMessage(phone, name, sex, age, number, birth, education, occupation, marital, wherelive, live, hypertension, hypertensiontime, hypertionsion, diabetes, diabetestime, hyperlipemia, hyperlipemiatime, LDLC, HDLC, TC, TG, angiocardiopathy, heartpaintime, myocardial, AF, ACVD, headblood, chocke, headchocke, TIA, headhurt, illposition, illlevel, drinkstate, smoke, isdrinktea, sleepstate, PEstate, socialstate, hobby, eathabits)){
            return "error";
        }

        BasicInfo basicInfo = regService.dealMessage(phone, name, sex, age, number, birth, education, occupation, marital, wherelive, live, hypertension, hypertensiontime, hypertionsion, diabetes, diabetestime, hyperlipemia, hyperlipemiatime, LDLC, HDLC, TC, TG, angiocardiopathy, heartpaintime, myocardial, AF, ACVD, headblood, chocke, headchocke, TIA, headhurt, illposition, illlevel, drinkstate, smoke, isdrinktea, sleepstate, PEstate, socialstate, hobby, eathabits);

        regService.saveToDatabase(basicInfo);

        return "hh";
    }
}
