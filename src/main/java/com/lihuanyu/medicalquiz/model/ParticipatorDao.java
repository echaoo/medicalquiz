package com.lihuanyu.medicalquiz.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by echao on 2016/3/4.
 */
public interface ParticipatorDao extends CrudRepository<Participator,Integer>{
    public Collection<Participator> findByAdmissionnum(int admissionnum);
}
