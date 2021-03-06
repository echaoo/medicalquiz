package com.lihuanyu.medicalquiz.services;

import com.lihuanyu.medicalquiz.model.BasicInfo;
import com.lihuanyu.medicalquiz.model.BasicInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by skyADMIN on 16/4/14.
 */
@Service
public class RegService {

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private BasicInfoDao basicInfoDao;

    public boolean saveToDatabase(BasicInfo basicInfo) {
        try {
            basicInfoDao.save(basicInfo);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean checkMessage(String phone, String name, String sex, String age, String number, String birth, String education, String occupation, String marital, String wherelive, String live, String hypertension, String hypertensiontime, String hypertionsion, String diabetes, String diabetestime, String hyperlipemia, String hyperlipemiatime, String LDLC, String HDLC, String TC, String TG, String angiocardiopathy, String heartpaintime, String myocardial, String AF, String ACVD, String headblood, String chocke, String headchocke, String TIA, String headhurt, String illposition, String illlevel, String drinkstate, String smoke, String isdrinktea, String sleepstate, String PEstate, String socialstate, String hobby, String eathabits) {
        if (isChoose(sex) && isChoose(education) && isChoose(occupation) && isChoose(marital) && isChoose(wherelive) && isChoose(hypertension) && isChoose(diabetes) && isChoose(hyperlipemia) && isChoose(angiocardiopathy) && isChoose(ACVD) && isChoose(drinkstate) && isChoose(smoke) && isChoose(isdrinktea) && isChoose(sleepstate) && isChoose(PEstate) && isChoose(socialstate) && isChoose(hobby) && isChoose(eathabits)) {
            return true;
        } else {
            return false;
        }
    }

    public BasicInfo dealMessage(String phone, String name, String sex, String age, String number, String birth, String education, String occupation, String marital, String wherelive, String live, String hypertension, String hypertensiontime, String hypertionsion, String diabetes, String diabetestime, String hyperlipemia, String hyperlipemiatime, String LDLC, String HDLC, String TC, String TG, String angiocardiopathy, String heartpaintime, String myocardial, String AF, String ACVD, String headblood, String chocke, String headchocke, String TIA, String headhurt, String illposition, String illlevel, String drinkstate, String smoke, String isdrinktea, String sleepstate, String PEstate, String socialstate, String hobby, String eathabits) {

        BasicInfo basicInfo = new BasicInfo();
        basicInfo.setPhonenumber(phone);
        basicInfo.setName(name);
        basicInfo.setSex(sex.charAt(0));
        basicInfo.setYear(Integer.parseInt(changeNullToZero(age)));
        basicInfo.setNumber(number);
        basicInfo.setBirthtime(birth);
        basicInfo.setEducation(education);
        basicInfo.setOccupation(occupation);
        basicInfo.setMarital(marital);
        basicInfo.setWherelive(wherelive);
        basicInfo.setLive(live);
        basicInfo.setHypertension(hypertension.charAt(0));

        basicInfo.setHypertensiontime(Integer.parseInt(changeNullToZero(hypertensiontime)));
        basicInfo.setHypertionsion(Integer.parseInt(changeNullToZero(hypertionsion)));
        basicInfo.setDiabetes(diabetes.charAt(0));
        basicInfo.setDiabetestime(Integer.parseInt(changeNullToZero(diabetestime)));
        basicInfo.setHyperlipemia(hyperlipemia.charAt(0));
        basicInfo.setHyperlipemiatime(Integer.parseInt(changeNullToZero(hyperlipemiatime)));
        basicInfo.setLDLC(Integer.parseInt(changeNullToZero(LDLC)));
        basicInfo.setHDLC(Integer.parseInt(changeNullToZero(HDLC)));
        basicInfo.setTC(Integer.parseInt(changeNullToZero(TC)));
        basicInfo.setTG(Integer.parseInt(changeNullToZero(TG)));
        basicInfo.setAngiocardiopathy(angiocardiopathy.charAt(0));
        basicInfo.setHeartpaintime(Integer.parseInt(changeNullToZero(heartpaintime)));
        basicInfo.setMyocardial(Integer.parseInt(changeNullToZero(myocardial)));
        basicInfo.setAF(Integer.parseInt(changeNullToZero(AF)));
        basicInfo.setACVD(ACVD.charAt(0));
        basicInfo.setHeadblood(Integer.parseInt(changeNullToZero(headblood)));
        basicInfo.setChocke(Integer.parseInt(changeNullToZero(chocke)));
        basicInfo.setHeadchocke(Integer.parseInt(changeNullToZero(headchocke)));
        basicInfo.setTIA(Integer.parseInt(changeNullToZero(TIA)));
        basicInfo.setHeadhurt(Integer.parseInt(changeNullToZero(headhurt)));
        basicInfo.setIllposition(illposition);
        basicInfo.setIlllevel(illlevel);
        basicInfo.setDrinkstate(drinkstate);
        basicInfo.setSmoke(smoke);
        basicInfo.setIsdrinktea(isdrinktea);
        basicInfo.setSleepstate(sleepstate);
        basicInfo.setPEstate(PEstate);
        basicInfo.setSocialstate(socialstate);
        basicInfo.setHobby(hobby);
        basicInfo.setEathabits(eathabits);
        return basicInfo;
    }

    public boolean isChoose(String m) {
        if (m.equals("请选择")) {
            return false;
        } else {
            return true;
        }
    }

    public String changeNullToZero(String m) {
        if (m.equals("")) {
            return "0";
        } else {
            return m;
        }
    }

    public BasicInfo dealChangeInfo(String sex, String age, String number, String birth, String education, String occupation, String marital, String wherelive, String live, String hypertension, String hypertensiontime, String hypertionsion, String diabetes, String diabetestime, String hyperlipemia, String hyperlipemiatime, String ldlc, String hdlc, String tc, String tg, String angiocardiopathy, String heartpaintime, String myocardial, String af, String acvd, String headblood, String chocke, String headchocke, String tia, String headhurt, String illposition, String illlevel, String drinkstate, String smoke, String isdrinktea, String sleepstate, String pEstate, String socialstate, String hobby, String eathabits) {
        int userid = (int) httpSession.getAttribute("userid");
        BasicInfo basicInfo = basicInfoDao.findOne(userid);
        basicInfo.setSex(sex.charAt(0));
        basicInfo.setYear(Integer.parseInt(age));
        basicInfo.setNumber(number);
        basicInfo.setBirthtime(birth);
        basicInfo.setEducation(education);
        basicInfo.setOccupation(occupation);
        basicInfo.setMarital(marital);
        basicInfo.setWherelive(wherelive);
        basicInfo.setLive(live);
        basicInfo.setHypertension(hypertension.charAt(0));
        basicInfo.setHypertensiontime(Integer.parseInt(hypertensiontime));
        basicInfo.setHypertionsion(Integer.parseInt(hypertionsion));
        basicInfo.setDiabetes(diabetes.charAt(0));
        basicInfo.setDiabetestime(Integer.parseInt(diabetestime));
        basicInfo.setHyperlipemia(hyperlipemia.charAt(0));
        basicInfo.setHyperlipemiatime(Integer.parseInt(hyperlipemiatime));
        basicInfo.setLDLC(Integer.parseInt(ldlc));
        basicInfo.setHDLC(Integer.parseInt(hdlc));
        basicInfo.setTC(Integer.parseInt(tc));
        basicInfo.setTG(Integer.parseInt(tg));
        basicInfo.setAngiocardiopathy(angiocardiopathy.charAt(0));
        basicInfo.setHeartpaintime(Integer.parseInt(heartpaintime));
        basicInfo.setMyocardial(Integer.parseInt(myocardial));
        basicInfo.setAF(Integer.parseInt(af));
        basicInfo.setACVD(acvd.charAt(0));
        basicInfo.setHeadblood(Integer.parseInt(headblood));
        basicInfo.setChocke(Integer.parseInt(chocke));
        basicInfo.setHeadchocke(Integer.parseInt(headchocke));
        basicInfo.setTIA(tia.charAt(0));
        basicInfo.setHeadhurt(Integer.parseInt(headhurt));
        basicInfo.setIllposition(illposition);
        basicInfo.setIlllevel(illlevel);
        basicInfo.setDrinkstate(drinkstate);
        basicInfo.setSmoke(smoke);
        basicInfo.setIsdrinktea(isdrinktea);
        basicInfo.setSleepstate(sleepstate);
        basicInfo.setPEstate(pEstate);
        basicInfo.setSocialstate(socialstate);
        basicInfo.setHobby(hobby);
        basicInfo.setEathabits(eathabits);
        return basicInfo;
    }
}
