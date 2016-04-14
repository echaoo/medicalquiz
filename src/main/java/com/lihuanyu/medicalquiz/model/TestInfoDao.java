package com.lihuanyu.medicalquiz.model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by skyADMIN on 16/4/14.
 */
public interface TestInfoDao extends CrudRepository<TestInfo,Integer> {
    public Iterable<TestInfo> findById(int id);
    public Iterable<TestInfo> findByUserid(int id);
}
