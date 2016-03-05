package com.lihuanyu.medicalquiz.services;

import com.lihuanyu.medicalquiz.model.Participator;
import com.lihuanyu.medicalquiz.model.ParticipatorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by echao on 2016/3/5.
 */
@Service
public class CreateMessage {

    @Autowired
    private ParticipatorDao participatorDao;

    public String saveMessage(int id,int admissionnum,String name,int age,int number,char sex,String birth){
        Participator participator = new Participator();
        participator.setAdmissionnum(admissionnum);
        participator.setAge(age);
        participator.setId(id);
        participator.setBirth(birth);
        participator.setName(name);
        participator.setNumber(number);
        participator.setSex(sex);
        participatorDao.save(participator);
        return "success";

    }
}
