package com.lihuanyu.medicalquiz.services;

import com.lihuanyu.medicalquiz.model.TestInfo;
import com.lihuanyu.medicalquiz.model.TestInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * Created by skyADMIN on 16/4/14.
 */
@Service
public class UserCenterService {

    @Autowired
    private TestInfoDao testInfoDao;

    public void showMessage(int id, Model model) {
        Iterable<TestInfo> testInfos = testInfoDao.findByUserid(id);
        model.addAttribute("testInfos",testInfos);
    }
}
