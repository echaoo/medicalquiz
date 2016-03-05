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
    private String name;
    private String education;
    private String occupation;
    private String marital;//婚姻状况
    private String live;//居住状况
    private String wherelive;//居住地

    //第二项
    private char hypertension;//高血压
    private int hypertensiontime;
    private int hypertionsion;
    private char diabetes;//糖尿病
    private int diabetestime;
    private char hyperlipemia;//高血脂
    private int hyperlipemiatime;
    private int LDLC;
    private int HDLC;
    private int TC;
    private int TG;
    private char angiocardiopathy;//心血管病
    private int heartpaintime;//心绞痛
    private int myocardial;//心肌梗死
    private int AF;//心房纤颤
    private char ACVD;//脑血管病
    private int headblood;//脑出血
    private int chocke;//腔梗
    private int headchocke;//脑梗死；
    private int TIA;
    private int headhurt;
    private String illposition;//脑病变部位
    private int illlevel;
    private String habitus;//体型
    private int weight;
    private float height;
    private float BIM;

    //第三项
    private String drinkstate;
    private String smoke;
    private int firstsmokeage;
    private int smokecount;
    private String isdrinktea;
    private String sleepstate;
    private char afternoonnap;
    private String snore;
    private String PEstate;
    private String socialstate;
    private String hobby;//多选怎么办
    private String eathabits;

    //第四项
    private int four1;
    private int four2;
    private int four3;
    private int four4;
    private int score;

}
