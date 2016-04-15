package com.lihuanyu.medicalquiz.model;

import javax.persistence.*;

/**
 * Created by skyADMIN on 16/4/14.
 */
@Entity
@Table(name = "emtestinfo")
public class EMTestInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int userid;

    private double correctrate1;    //编码测试正确率
    private int avecorrecttime1;  //回答正确平均用时
    private String usetime1;    //编码测试使用时间详情
    private String detail1;     //选择详情

    private double correctrate2;    //编码第二次正确率
    private int avecorrecttime2;
    private String usetime2;    //第二次使用时间详情
    private String detail2;

    private double correctrate3;
    private int avecorrecttime3;
    private String usetime3;
    private String detail3;

    private double correctrate4;
    private int avecorrecttime4;
    private String usetime4;
    private String detail4;

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

    public double getCorrectrate1() {
        return correctrate1;
    }

    public void setCorrectrate1(double correctrate1) {
        this.correctrate1 = correctrate1;
    }

    public int getAvecorrecttime1() {
        return avecorrecttime1;
    }

    public void setAvecorrecttime1(int avecorrecttime) {
        this.avecorrecttime1 = avecorrecttime;
    }

    public String getUsetime1() {
        return usetime1;
    }

    public void setUsetime1(String usetime1) {
        this.usetime1 = usetime1;
    }

    public String getDetail1() {
        return detail1;
    }

    public void setDetail1(String detail1) {
        this.detail1 = detail1;
    }

    public double getCorrectrate2() {
        return correctrate2;
    }

    public void setCorrectrate2(double correctrate2) {
        this.correctrate2 = correctrate2;
    }

    public int getAvecorrecttime2() {
        return avecorrecttime2;
    }

    public void setAvecorrecttime2(int avecorrecttime2) {
        this.avecorrecttime2 = avecorrecttime2;
    }

    public String getUsetime2() {
        return usetime2;
    }

    public void setUsetime2(String usetime2) {
        this.usetime2 = usetime2;
    }

    public String getDetail2() {
        return detail2;
    }

    public void setDetail2(String detail2) {
        this.detail2 = detail2;
    }

    public double getCorrectrate3() {
        return correctrate3;
    }

    public void setCorrectrate3(double correctrate3) {
        this.correctrate3 = correctrate3;
    }

    public int getAvecorrecttime3() {
        return avecorrecttime3;
    }

    public void setAvecorrecttime3(int avecorrecttime3) {
        this.avecorrecttime3 = avecorrecttime3;
    }

    public String getUsetime3() {
        return usetime3;
    }

    public void setUsetime3(String usetime3) {
        this.usetime3 = usetime3;
    }

    public String getDetail3() {
        return detail3;
    }

    public void setDetail3(String detail3) {
        this.detail3 = detail3;
    }

    public double getCorrectrate4() {
        return correctrate4;
    }

    public void setCorrectrate4(double correctrate4) {
        this.correctrate4 = correctrate4;
    }

    public int getAvecorrecttime4() {
        return avecorrecttime4;
    }

    public void setAvecorrecttime4(int avecorrecttime4) {
        this.avecorrecttime4 = avecorrecttime4;
    }

    public String getUsetime4() {
        return usetime4;
    }

    public void setUsetime4(String usetime4) {
        this.usetime4 = usetime4;
    }

    public String getDetail4() {
        return detail4;
    }

    public void setDetail4(String detail4) {
        this.detail4 = detail4;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
