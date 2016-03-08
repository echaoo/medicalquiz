package com.lihuanyu.medicalquiz.model;

/**
 * Created by echao on 2016/3/8.
 */
public class BaicInfo {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getIlllevel() {
        return illlevel;
    }

    public void setIlllevel(int illlevel) {
        this.illlevel = illlevel;
    }

    public String getHabitus() {
        return habitus;
    }

    public void setHabitus(String habitus) {
        this.habitus = habitus;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBIM() {
        return BIM;
    }

    public void setBIM(float BIM) {
        this.BIM = BIM;
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

    public int getFirstsmokeage() {
        return firstsmokeage;
    }

    public void setFirstsmokeage(int firstsmokeage) {
        this.firstsmokeage = firstsmokeage;
    }

    public int getSmokecount() {
        return smokecount;
    }

    public void setSmokecount(int smokecount) {
        this.smokecount = smokecount;
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

    public char getAfternoonnap() {
        return afternoonnap;
    }

    public void setAfternoonnap(char afternoonnap) {
        this.afternoonnap = afternoonnap;
    }

    public String getSnore() {
        return snore;
    }

    public void setSnore(String snore) {
        this.snore = snore;
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
