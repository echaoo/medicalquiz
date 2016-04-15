package com.lihuanyu.medicalquiz.services;

import org.springframework.stereotype.Service;

/**
 * Created by skyADMIN on 16/4/15.
 */
@Service
public class EMTestService {



    public void dealemtest1(String correct, String time){
        int right = 0;
        int wrong = 0;
        int alltime = 0;
        int correcttime = 0;
        int wrongtime = 0;
        String[] timeeach = time.split(";");
        for (int i = 0; i < 40; i++) {
            char temp = correct.charAt(i);
            int thistime = Integer.parseInt(timeeach[i]);
            alltime += thistime;
            //System.out.println(thistime);
            if (temp == '1'){
                correcttime+=thistime;
                right++;
            }else if (temp == '2'){
                wrong++;
            }
        }
        double correctrate = right/40.0;
        int avecorrecttime = correcttime/right;



        System.out.println(right + " " + wrong);
    }

    public void saveEMTest1ToDatabase(String usetime1, String detail1, double correctrate1, int avecorrecttime){

    }
}
