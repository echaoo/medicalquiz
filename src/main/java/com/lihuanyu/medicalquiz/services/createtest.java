package com.lihuanyu.medicalquiz.services;

import com.lihuanyu.medicalquiz.model.Datum;
import com.lihuanyu.medicalquiz.model.DatumDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by echao on 2016/3/5.
 */
@Service
public class CreateTest {

    @Autowired
    private DatumDao datumDao;

    public String saveTest(Datum datum){
        Datum datum1 = new Datum();
        datum1.setId(datum.getId());
        datum1.setAdmnum(datum.getAdmnum());
        datum1.setName(datum.getName());
        datum1.setEducation(datum.getEducation());
        datum1.setOccupation(datum.getOccupation());
        datum1.setMarital(datum.getMarital());
        datum1.setLive(datum.getLive());
        datum1.setWherelive(datum.getWherelive());
        datum1.setHypertension(datum.getHypertension());
        datum1.setHypertensiontime(datum.getHypertensiontime());
        datum1.setHypertionsion(datum.getHypertionsion());
        datum1.setDiabetes(datum.getDiabetes());
        datum1.setDiabetestime(datum.getDiabetestime());
        datum1.setHyperlipemia(datum.getHyperlipemia());
        datum1.setHypertensiontime(datum.getHypertensiontime());
        datum1.setLDLC(datum.getLDLC());
        datum1.setHDLC(datum.getHDLC());
        datum1.setTC(datum.getTC());
        datum1.setTG(datum.getTG());
        datum1.setAngiocardiopathy(datum.getAngiocardiopathy());
        datum1.setHeartpaintime(datum.getHeartpaintime());
        datum1.setMyocardial(datum.getMyocardial());
        datum1.setAF(datum.getAF());
        datum1.setACVD(datum.getACVD());
        datum1.setHeadblood(datum.getHeadblood());
        datum1.setChocke(datum.getChocke());
        datum1.setHeadchocke(datum.getHeadchocke());
        datum1.setTIA(datum.getTIA());
        datum1.setHeadhurt(datum.getHeadhurt());
        datum1.setIllposition(datum.getIllposition());
        datum1.setIlllevel(datum.getIlllevel());
        datum1.setHabitus(datum.getHabitus());
        datum1.setWeight(datum.getWeight());
        datum1.setHeight(datum.getHeight());
        datum1.setBIM(datum.getBIM());
        datumDao.save(datum1);
        return "success";

    }
}
