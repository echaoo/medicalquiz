package com.lihuanyu.medicalquiz.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by echao on 2016/3/4.
 */
@Entity
@Table(name = "participator")
public class Participator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int admissionnum;
    private char sex;
    private int age;
    private int flag;
    private String  name;
    private Timestamp birth;
}
