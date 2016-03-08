package com.lihuanyu.medicalquiz.services;

import com.lihuanyu.medicalquiz.model.BasicInfo;
import com.lihuanyu.medicalquiz.model.BasicInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by echao on 2016/3/5.
 */
@Service
public class CreateTest {

    @Autowired
    private BasicInfoDao basicInfoDao;

    public String saveTest(String education,String occupation,String married ){
        BasicInfo basicInfo = new BasicInfo();
        basicInfo.setEducation(education);
        basicInfo.setOccupation(occupation);
        basicInfo.setMarital(married);
        basicInfoDao.save(basicInfo);
        return "success";

    }
}
