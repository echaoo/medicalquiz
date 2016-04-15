package com.lihuanyu.medicalquiz.services;

import com.lihuanyu.medicalquiz.model.EMTestInfo;
import com.lihuanyu.medicalquiz.model.EMTestInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by skyADMIN on 16/4/15.
 */
@Service
public class EMTestService {

    @Autowired
    private EMTestInfoDao emTestInfoDao;

    @Autowired
    private HttpSession httpSession;

    public void dealemtest1(String correct, String time) {
        int right = 0;
        int wrong = 0;
        int alltime = 0;
        int correcttime = 0;
        int wrongtime = 0;
        String[] timeeach = time.split(";");
        for (int i = 0; i < 40; i++) {
            char temp = correct.charAt(i);
            int thistime = Integer.parseInt(timeeach[i]);
            alltime += thistime;
            //System.out.println(thistime);
            if (temp == '1') {
                correcttime += thistime;
                right++;
            } else if (temp == '2') {
                wrong++;
            }
        }
        double correctrate = right / 40.0;
        int avecorrecttime = correcttime / right;
        saveEMTest1ToDatabase(time, correct, correctrate, avecorrecttime);
    }

    public void saveEMTest1ToDatabase(String usetime1, String detail1, double correctrate1, int avecorrecttime) {
        EMTestInfo emTestInfo = new EMTestInfo();
        emTestInfo.setUserid((Integer) httpSession.getAttribute("userid"));
        emTestInfo.setAvecorrecttime1(avecorrecttime);
        emTestInfo.setDetail1(detail1);
        emTestInfo.setUsetime1(usetime1);
        emTestInfo.setCorrectrate1(correctrate1);
        emTestInfo = emTestInfoDao.save(emTestInfo);
        System.out.println(emTestInfo.getId());
        httpSession.setAttribute("emtestid", emTestInfo.getId());
    }

    public void dealemtest2(String correct, String time) {
        int right = 0;
        int correcttime = 0;
        String[] timeeach = time.split(";");
        for (int i = 0; i < 40; i++) {
            char temp = correct.charAt(i);
            int thistime = Integer.parseInt(timeeach[i]);
            //System.out.println(thistime);
            if (temp == '1') {
                correcttime += thistime;
                right++;
            }
        }
        double correctrate = right / 40.0;
        int avecorrecttime = 0;
        if (right == 0 || correcttime == 0) {
            avecorrecttime = 0;
        } else {
            avecorrecttime = correcttime / right;
        }
        saveEMTest2ToDatabase(time, correct, correctrate, avecorrecttime);
    }

    private void saveEMTest2ToDatabase(String time, String correct, double correctrate, int avecorrecttime) {
        int emtestid = (int) httpSession.getAttribute("emtestid");
        EMTestInfo emTestInfo = emTestInfoDao.findOne(emtestid);
        emTestInfo.setAvecorrecttime2(avecorrecttime);
        emTestInfo.setDetail2(correct);
        emTestInfo.setUsetime2(time);
        emTestInfo.setCorrectrate2(correctrate);
        emTestInfoDao.save(emTestInfo);
    }

    public void dealemtest3(String correct, String time) {
        int right = 0;
        int wrong = 0;
        int unknow = 0;
        int alltime = 0;
        int correcttime = 0;
        int wrongtime = 0;
        String[] timeeach = time.split(";");
        for (int i = 0; i < 16; i++) {
            char temp = correct.charAt(i);
            int thistime = Integer.parseInt(timeeach[i]);
            alltime += thistime;
            if (temp == '1') {
                correcttime += thistime;
                right++;
            } else if (temp == '2') {
                wrong++;
            }
        }
        double correctrate = right / 16.0;
        int avecorrecttime = correcttime / right;
        saveEMTest3ToDatabase(time, correct, correctrate, avecorrecttime);
    }

    private void saveEMTest3ToDatabase(String time, String correct, double correctrate, int avecorrecttime) {
        int emtestid = (int) httpSession.getAttribute("emtestid");
        EMTestInfo emTestInfo = emTestInfoDao.findOne(emtestid);
        emTestInfo.setAvecorrecttime3(avecorrecttime);
        emTestInfo.setDetail3(correct);
        emTestInfo.setUsetime3(time);
        emTestInfo.setCorrectrate3(correctrate);
        emTestInfoDao.save(emTestInfo);
    }

    public void dealemtest4(String correct, String time) {
        int right = 0;
        int correcttime = 0;
        String[] timeeach = time.split(";");
        for (int i = 0; i < 32; i++) {
            char temp = correct.charAt(i);
            int thistime = Integer.parseInt(timeeach[i]);
            if (temp == '1') {
                correcttime += thistime;
                right++;
            }
        }
        double correctrate = right / 16.0;
        int avecorrecttime = correcttime / right;
        saveEMTest4ToDatabase(time, correct, correctrate, avecorrecttime);
    }

    private void saveEMTest4ToDatabase(String time, String correct, double correctrate, int avecorrecttime) {
        int emtestid = (int) httpSession.getAttribute("emtestid");
        EMTestInfo emTestInfo = emTestInfoDao.findOne(emtestid);
        emTestInfo.setAvecorrecttime4(avecorrecttime);
        emTestInfo.setDetail4(correct);
        emTestInfo.setUsetime4(time);
        emTestInfo.setCorrectrate4(correctrate);
        emTestInfoDao.save(emTestInfo);
    }

}
