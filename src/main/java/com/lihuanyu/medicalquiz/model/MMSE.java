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
    private int five2;
    private int five3;
    private int five4;
    private int five5;
    private int five6;
    private int five7;
    private int five8;
    private int five9;
    private int five10;
    private int five11;
    private int  five12;
    private int five13;
    private int five14;
    private int five15;
    private int five16;
    private int five17;
    private int five18;
    private int five19;
    private int five20;
    private int score;


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


    public int getFive1() {
        return five1;
    }

    public void setFive1(int five1) {
        this.five1 = five1;
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


    public int getFive15() {
        return five15;
    }

    public void setFive15(int five15) {
        this.five15 = five15;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFive2() {
        return five2;
    }

    public void setFive2(int five2) {
        this.five2 = five2;
    }

    public int getFive3() {
        return five3;
    }

    public void setFive3(int five3) {
        this.five3 = five3;
    }

    public int getFive4() {
        return five4;
    }

    public void setFive4(int five4) {
        this.five4 = five4;
    }

    public int getFive5() {
        return five5;
    }

    public void setFive5(int five5) {
        this.five5 = five5;
    }

    public int getFive6() {
        return five6;
    }

    public void setFive6(int five6) {
        this.five6 = five6;
    }

    public int getFive7() {
        return five7;
    }

    public void setFive7(int five7) {
        this.five7 = five7;
    }

    public int getFive8() {
        return five8;
    }

    public void setFive8(int five8) {
        this.five8 = five8;
    }

    public int getFive9() {
        return five9;
    }

    public void setFive9(int five9) {
        this.five9 = five9;
    }

    public int getFive10() {
        return five10;
    }

    public void setFive10(int five10) {
        this.five10 = five10;
    }

    public int getFive14() {
        return five14;
    }

    public void setFive14(int five14) {
        this.five14 = five14;
    }


}
