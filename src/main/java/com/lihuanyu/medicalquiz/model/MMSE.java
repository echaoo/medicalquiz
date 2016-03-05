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
    private int number;//编号
    private char sex;
    private int age;
    private String name;
    private int five1;
    private String five2;
    private String five3;
    private String five4;
    private String five5;

    public String getFive6() {
        return five6;
    }

    public void setFive6(String five6) {
        this.five6 = five6;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getFive1() {
        return five1;
    }

    public void setFive1(int five1) {
        this.five1 = five1;
    }

    public String getFive2() {
        return five2;
    }

    public void setFive2(String five2) {
        this.five2 = five2;
    }

    public String getFive3() {
        return five3;
    }

    public void setFive3(String five3) {
        this.five3 = five3;
    }

    public String getFive4() {
        return five4;
    }

    public void setFive4(String five4) {
        this.five4 = five4;
    }

    public String getFive5() {
        return five5;
    }

    public void setFive5(String five5) {
        this.five5 = five5;
    }

    public String getFive7() {
        return five7;
    }

    public void setFive7(String five7) {
        this.five7 = five7;
    }

    public String getFive8() {
        return five8;
    }

    public void setFive8(String five8) {
        this.five8 = five8;
    }

    public String getFive9() {
        return five9;
    }

    public void setFive9(String five9) {
        this.five9 = five9;
    }

    public String getFive10() {
        return five10;
    }

    public void setFive10(String five10) {
        this.five10 = five10;
    }

    public int getFive11() {
        return five11;
    }

    public void setFive11(int five11) {
        this.five11 = five11;
    }

    public int getFive12() {
        return five12;
    }

    public void setFive12(int five12) {
        this.five12 = five12;
    }

    public int getFive13() {
        return five13;
    }

    public void setFive13(int five13) {
        this.five13 = five13;
    }

    public String getFive14() {
        return five14;
    }

    public void setFive14(String five14) {
        this.five14 = five14;
    }

    public String getFive15() {
        return five15;
    }

    public void setFive15(String five15) {
        this.five15 = five15;
    }

    public int getFive16() {
        return five16;
    }

    public void setFive16(int five16) {
        this.five16 = five16;
    }

    public int getFive17() {
        return five17;
    }

    public void setFive17(int five17) {
        this.five17 = five17;
    }

    public int getFive18() {
        return five18;
    }

    public void setFive18(int five18) {
        this.five18 = five18;
    }

    public int getFive19() {
        return five19;
    }

    public void setFive19(int five19) {
        this.five19 = five19;
    }

    public int getFive20() {
        return five20;
    }

    public void setFive20(int five20) {
        this.five20 = five20;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

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
