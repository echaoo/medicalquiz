package com.lihuanyu.medicalquiz.service;

import com.lihuanyu.medicalquiz.MedicalquizApplication;
import com.lihuanyu.medicalquiz.services.EMTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.servlet.http.HttpSession;

/**
 * Created by skyADMIN on 16/4/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MedicalquizApplication.class)
@WebAppConfiguration
public class EMTestServiceTest {

    @Autowired
    private EMTestService emTestService;

    @Autowired
    private HttpSession httpSession;

    @Test
    public void testDealEMTest1() {
        httpSession.setAttribute("userid",1);
        String correct = "2111221221222222111112222111121212221111";
        String time = "1357;692;3065;132;250;100;214;308;97;110;93;91;197;91;91;83;213;99;92;100;551;97;82;103;85;110;102;92;90;99;101;196;82;115;84;102;422;98;491;1195;1195;";
        emTestService.dealemtest1(correct, time);
    }

    @Test
    public void testDealEMTest2() {
        httpSession.setAttribute("userid",1);
        httpSession.setAttribute("emtestid",1);
        String correct = "2222222222222222222222222222222222222222";
        String time = "943;129;170;131;188;124;203;92;108;97;101;99;98;96;107;98;109;90;98;99;179;99;107;108;97;100;108;92;115;210;108;106;106;88;229;178;163;204;291;234;";
        emTestService.dealemtest2(correct, time);
    }

}
