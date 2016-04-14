package com.lihuanyu.medicalquiz.model;

import javax.persistence.*;

/**
 * Created by skyADMIN on 16/4/14.
 */
@Entity
@Table(name = "testinfo")
public class TestInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int userid; //对应basicinfo的id,标识对应的用户

    private String datumtest;
    private int datumscore;
    private String mmsetest;
    private int mmsetestscore;


    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getDatumtest() {
        return datumtest;
    }

    public void setDatumtest(String datumtest) {
        this.datumtest = datumtest;
    }

    public String getMmsetest() {
        return mmsetest;
    }

    public void setMmsetest(String mmsetest) {
        this.mmsetest = mmsetest;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDatumscore() {
        return datumscore;
    }

    public void setDatumscore(int datumscore) {
        this.datumscore = datumscore;
    }

    public int getMmsetestscore() {
        return mmsetestscore;
    }

    public void setMmsetestscore(int mmsetestscore) {
        this.mmsetestscore = mmsetestscore;
    }
}
