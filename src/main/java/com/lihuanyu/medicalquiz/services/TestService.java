package com.lihuanyu.medicalquiz.services;

import com.lihuanyu.medicalquiz.model.BasicInfo;
import com.lihuanyu.medicalquiz.model.BasicInfoDao;
import com.lihuanyu.medicalquiz.model.TestInfo;
import com.lihuanyu.medicalquiz.model.TestInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by skyADMIN on 16/4/14.
 */
@Service
public class TestService {

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private BasicInfoDao basicInfoDao;

    @Autowired
    private TestInfoDao testInfoDao;

    public void dealContinueTest(String result, int score){
        TestInfo testInfo = new TestInfo();
        testInfo.setDatumtest(result);
        testInfo.setDatumscore(score);
        testInfo.setMmsetest("0");
        testInfo.setMmsetestscore(0);
        String phone = (String) httpSession.getAttribute("phone");
        BasicInfo basicInfo = basicInfoDao.findByPhonenumber(phone);
        int userid = basicInfo.getId();
        testInfo.setUserid(userid);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        testInfo.setTime(time);
        testInfoDao.save(testInfo);
        httpSession.setAttribute("testid",testInfo.getId());
    }

    public void dealDatumTest(String result, int score){
        TestInfo testInfo = new TestInfo();
        testInfo.setDatumtest(result);
        testInfo.setDatumscore(score);
        testInfo.setMmsetest("0");
        testInfo.setMmsetestscore(0);
        String phone = (String) httpSession.getAttribute("phone");
        BasicInfo basicInfo = basicInfoDao.findByPhonenumber(phone);
        int userid = basicInfo.getId();
        testInfo.setUserid(userid);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        testInfo.setTime(time);

        testInfoDao.save(testInfo);
    }

    public void dealEmseTest(int ans, String detail) {
        int testid = (int) httpSession.getAttribute("testid");
        TestInfo testInfo = testInfoDao.findOne(testid);
        testInfo.setMmsetestscore(ans);
        testInfo.setMmsetest(detail);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        testInfo.setTime(time);
        testInfoDao.save(testInfo);
    }
}
