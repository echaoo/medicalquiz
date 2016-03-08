package com.lihuanyu.medicalquiz.model;

import javax.persistence.*;

/**
 * Created by echao on 2016/3/4.
 */
@Entity
@Table(name = "participator")
public class Participator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int admissionnum;//住院号
    private char sex;
    private int age;
    private String number;
    private String name;
    private String birth;

    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdmissionnum() {
        return admissionnum;
    }

    public void setAdmissionnum(int admissionnum) {
        this.admissionnum = admissionnum;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
