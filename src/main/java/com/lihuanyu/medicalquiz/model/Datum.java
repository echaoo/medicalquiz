package com.lihuanyu.medicalquiz.model;

import javax.persistence.*;

/**
 * Created by echao on 2016/3/4.
 */
@Entity
@Table(name = "datum")
public class Datum {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int admnum;//住院号

    //第四项
    private int four1;
    private int four2;
    private int four3;
    private int four4;
    private int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdmnum() {
        return admnum;
    }

    public void setAdmnum(int admnum) {
        this.admnum = admnum;
    }

    public int getFour1() {
        return four1;
    }

    public void setFour1(int four1) {
        this.four1 = four1;
    }

    public int getFour2() {
        return four2;
    }

    public void setFour2(int four2) {
        this.four2 = four2;
    }

    public int getFour3() {
        return four3;
    }

    public void setFour3(int four3) {
        this.four3 = four3;
    }

    public int getFour4() {
        return four4;
    }

    public void setFour4(int four4) {
        this.four4 = four4;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
