package com.lihuanyu.medicalquiz.model;

import javax.persistence.*;

/**
 * Created by echao on 2016/3/4.
 */
@Entity
@Table(name = "MMSE")
public class MMSE {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int number;
    private char sex;
    private int age;
    private String name;
    private int five1;
    private String five2;
    private String five3;
    private String five4;
    private String five5;
    private String five6;
    private String five7;
    private String five8;
    private String five9;
    private String five10;
    private int five11;
    private int  five12;
    private int five13;
    private String five14;
    private String five15;
    private int five16;
    private int five17;
    private int five18;
    private int five19;
    private int five20;
    private int score;

}
