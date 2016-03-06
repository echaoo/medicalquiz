package com.lihuanyu.medicalquiz.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by echao on 2016/3/4.
 */
public interface MMSEDao extends CrudRepository<MMSE,Integer> {
    public Collection<MMSE> findByNumber(int number);
}
