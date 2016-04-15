package com.lihuanyu.medicalquiz.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by echao on 2016/3/8.
 */
@Entity
@Table(name = "basicinfo")
public class BasicInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String name;
    @Column(name = "phonenumber", nullable = false, unique = true)
    private String phonenumber;

    //人口学资料
    private char sex;
    private int year;
    private String number;
    private String birthtime;
    private String education;
    private String occupation;
    private String marital;//婚姻状况
    private String live;//居住状况
    private String wherelive;//居住地

    //既往史
    private char hypertension;//高血压 有Y无N不详U
    private int hypertensiontime; //患病时长
    private int hypertionsion; //最高mmhg
    private char diabetes;//糖尿病 有Y无N
    private int diabetestime; //患病时长
    private char hyperlipemia;//高血脂 有Y无N不详U
    private int hyperlipemiatime; //患病时长
    private int LDLC;
    private int HDLC;
    private int TC;
    private int TG;
    private char angiocardiopathy;//心血管病
    private int heartpaintime;//心绞痛
    private int myocardial;//心肌梗死
    private int AF;//心房纤颤

    private char ACVD;//脑血管病 有Y无N
    private int headblood;//脑出血
    private int chocke;//腔梗
    private int headchocke;//脑梗死
    private int TIA;
    private int headhurt;
    private String illposition;//脑病变部位
    private String illlevel;


    //生活方式
    private String drinkstate;
    private String smoke;
    private String isdrinktea;
    private String sleepstate;
    private String PEstate;
    private String socialstate;
    private String hobby;//多选怎么办
    private String eathabits;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(String birthtime) {
        this.birthtime = birthtime;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public String getWherelive() {
        return wherelive;
    }

    public void setWherelive(String wherelive) {
        this.wherelive = wherelive;
    }

    public char getHypertension() {
        return hypertension;
    }

    public void setHypertension(char hypertension) {
        this.hypertension = hypertension;
    }

    public int getHypertensiontime() {
        return hypertensiontime;
    }

    public void setHypertensiontime(int hypertensiontime) {
        this.hypertensiontime = hypertensiontime;
    }

    public int getHypertionsion() {
        return hypertionsion;
    }

    public void setHypertionsion(int hypertionsion) {
        this.hypertionsion = hypertionsion;
    }

    public char getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(char diabetes) {
        this.diabetes = diabetes;
    }

    public int getDiabetestime() {
        return diabetestime;
    }

    public void setDiabetestime(int diabetestime) {
        this.diabetestime = diabetestime;
    }

    public char getHyperlipemia() {
        return hyperlipemia;
    }

    public void setHyperlipemia(char hyperlipemia) {
        this.hyperlipemia = hyperlipemia;
    }

    public int getHyperlipemiatime() {
        return hyperlipemiatime;
    }

    public void setHyperlipemiatime(int hyperlipemiatime) {
        this.hyperlipemiatime = hyperlipemiatime;
    }

    public int getLDLC() {
        return LDLC;
    }

    public void setLDLC(int LDLC) {
        this.LDLC = LDLC;
    }

    public int getHDLC() {
        return HDLC;
    }

    public void setHDLC(int HDLC) {
        this.HDLC = HDLC;
    }

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public int getTG() {
        return TG;
    }

    public void setTG(int TG) {
        this.TG = TG;
    }

    public char getAngiocardiopathy() {
        return angiocardiopathy;
    }

    public void setAngiocardiopathy(char angiocardiopathy) {
        this.angiocardiopathy = angiocardiopathy;
    }

    public int getHeartpaintime() {
        return heartpaintime;
    }

    public void setHeartpaintime(int heartpaintime) {
        this.heartpaintime = heartpaintime;
    }

    public int getMyocardial() {
        return myocardial;
    }

    public void setMyocardial(int myocardial) {
        this.myocardial = myocardial;
    }

    public int getAF() {
        return AF;
    }

    public void setAF(int AF) {
        this.AF = AF;
    }

    public char getACVD() {
        return ACVD;
    }

    public void setACVD(char ACVD) {
        this.ACVD = ACVD;
    }

    public int getHeadblood() {
        return headblood;
    }

    public void setHeadblood(int headblood) {
        this.headblood = headblood;
    }

    public int getChocke() {
        return chocke;
    }

    public void setChocke(int chocke) {
        this.chocke = chocke;
    }

    public int getHeadchocke() {
        return headchocke;
    }

    public void setHeadchocke(int headchocke) {
        this.headchocke = headchocke;
    }

    public int getTIA() {
        return TIA;
    }

    public void setTIA(int TIA) {
        this.TIA = TIA;
    }

    public int getHeadhurt() {
        return headhurt;
    }

    public void setHeadhurt(int headhurt) {
        this.headhurt = headhurt;
    }

    public String getIllposition() {
        return illposition;
    }

    public void setIllposition(String illposition) {
        this.illposition = illposition;
    }

    public String getIlllevel() {
        return illlevel;
    }

    public void setIlllevel(String illlevel) {
        this.illlevel = illlevel;
    }

    public String getDrinkstate() {
        return drinkstate;
    }

    public void setDrinkstate(String drinkstate) {
        this.drinkstate = drinkstate;
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        this.smoke = smoke;
    }

    public String getIsdrinktea() {
        return isdrinktea;
    }

    public void setIsdrinktea(String isdrinktea) {
        this.isdrinktea = isdrinktea;
    }

    public String getSleepstate() {
        return sleepstate;
    }

    public void setSleepstate(String sleepstate) {
        this.sleepstate = sleepstate;
    }

    public String getPEstate() {
        return PEstate;
    }

    public void setPEstate(String PEstate) {
        this.PEstate = PEstate;
    }

    public String getSocialstate() {
        return socialstate;
    }

    public void setSocialstate(String socialstate) {
        this.socialstate = socialstate;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getEathabits() {
        return eathabits;
    }

    public void setEathabits(String eathabits) {
        this.eathabits = eathabits;
    }
}
