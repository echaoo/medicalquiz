package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.model.BasicInfo;
import com.lihuanyu.medicalquiz.model.BasicInfoDao;
import com.lihuanyu.medicalquiz.model.TestInfo;
import com.lihuanyu.medicalquiz.model.TestInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by skyADMIN on 16/4/15.
 */
@Controller
public class DetailController {

    @Autowired
    private TestInfoDao testInfoDao;

    @Autowired
    private BasicInfoDao basicInfoDao;

    @RequestMapping("/userdetail")
    public String showUserDetail(int userid, Model model) {
        BasicInfo basicInfo = basicInfoDao.findOne(userid);
        model.addAttribute("userinfo",basicInfo);
        return "usersdetail";
    }

    @RequestMapping("/testdetail")
    public String showTestDetail(int testid, Model model) {
        TestInfo testInfo = testInfoDao.findOne(testid);
        model.addAttribute("testinfo", testInfo);
        return "testdetail";
    }

}
