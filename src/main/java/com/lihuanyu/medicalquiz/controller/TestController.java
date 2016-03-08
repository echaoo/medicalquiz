package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.model.Datum;
import com.lihuanyu.medicalquiz.model.DatumDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by echao on 2016/3/8.
 */
@Controller
public class TestController {

    @Autowired
    private DatumDao datumDao;
    @RequestMapping(value = "/savetest",method = RequestMethod.GET)
    public String saveTestFour(int four1,int four2,int four3,int four4){
        Datum datum = new Datum();
      int score = four1+four2+four3+four4;
        datum.setScore(score);
        datumDao.save(datum);
        if(score <=2){
            return "fivetest";
        }else {
            return "finishtest";
        }
    }
}
