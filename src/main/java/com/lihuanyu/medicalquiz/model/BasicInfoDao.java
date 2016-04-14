package com.lihuanyu.medicalquiz.model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by echao on 2016/3/8.
 */
public interface BasicInfoDao extends CrudRepository<BasicInfo,Integer> {
    public BasicInfo findByPhonenumber(String phonenumber);
}
