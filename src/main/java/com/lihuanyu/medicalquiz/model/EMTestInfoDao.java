package com.lihuanyu.medicalquiz.model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by skyADMIN on 16/4/15.
 */
public interface EMTestInfoDao extends CrudRepository<EMTestInfo,Integer> {
    public Iterable<EMTestInfo> findByUserid(int id);
}
