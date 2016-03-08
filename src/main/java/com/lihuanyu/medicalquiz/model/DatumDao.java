package com.lihuanyu.medicalquiz.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by echao on 2016/3/4.
 */
public interface DatumDao extends CrudRepository<Datum,Integer> {
    public Datum findByAdmnum(int admnum);
}
