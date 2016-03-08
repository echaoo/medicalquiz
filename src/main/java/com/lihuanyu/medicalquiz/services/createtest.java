package com.lihuanyu.medicalquiz.services;

import com.lihuanyu.medicalquiz.model.BaicInfo;
import com.lihuanyu.medicalquiz.model.BaicInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by echao on 2016/3/5.
 */
@Service
public class CreateTest {

    @Autowired
    private BaicInfoDao baicInfoDao;

    public String saveTest(String education,String occupation,String married ){
        BaicInfo baicInfo = new BaicInfo();
        baicInfo.setEducation(education);
        baicInfo.setOccupation(occupation);
        baicInfo.setMarital(married);
        baicInfoDao.save(baicInfo);
        return "success";

    }
}
