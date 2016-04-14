package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.services.TestService;
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
    private TestService testService;

    @RequestMapping(value = "/savemmse", method = RequestMethod.POST)
    public String saveMmseTest(String ques1, String ques2, String ques3, String ques4, String ques5, String ques6, String ques7, String ques8, String ques9, String ques10, String ques11, String ques12, String ques13, String ques14, String ques15, String ques16, String ques17, String ques18, String ques19, String ques20) {
        int ans = addAllQues(ques1, ques2, ques3, ques4, ques5, ques6, ques7, ques8, ques9, ques10, ques11, ques12, ques13, ques14, ques15, ques16, ques17, ques18, ques19, ques20);
        String detail = ques1 + ques2 + ques3 + ques4 + ques5 + ques6 + ques7 + ques8 + ques9 + ques10 + ques11 + ques12 + ques13 + ques14 + ques15 + ques16 + ques17 + ques18 + ques19 + ques20;
        testService.dealEmseTest(ans, detail);
        return "finishtest";
    }

    @RequestMapping("/test")
    public String showTest() {
        return "datumtest";
    }

    @RequestMapping(value = "/savedatum", method = RequestMethod.POST)
    public String saveTestFour(String ques1, String ques2, String ques3, String ques4) {
        int score = Integer.parseInt(ques1) + Integer.parseInt(ques2) + Integer.parseInt(ques3) + Integer.parseInt(ques4);
        String detail = ques1 + ques2 + ques3 + ques4;
        if (score <= 2) {
            testService.dealContinueTest(detail, score);
            return "mmsetest";
        } else {
            testService.dealDatumTest(detail, score);
            return "finishtest";
        }
    }

    private int addAllQues(String ques1, String ques2, String ques3, String ques4, String ques5, String ques6, String ques7, String ques8, String ques9, String ques10, String ques11, String ques12, String ques13, String ques14, String ques15, String ques16, String ques17, String ques18, String ques19, String ques20) {
        int ans = 0;
        ans = stringToIntadd(ans, ques1);
        ans = stringToIntadd(ans, ques2);
        ans = stringToIntadd(ans, ques3);
        ans = stringToIntadd(ans, ques4);
        ans = stringToIntadd(ans, ques5);
        ans = stringToIntadd(ans, ques6);
        ans = stringToIntadd(ans, ques7);
        ans = stringToIntadd(ans, ques8);
        ans = stringToIntadd(ans, ques9);
        ans = stringToIntadd(ans, ques10);
        ans = stringToIntadd(ans, ques11);
        ans = stringToIntadd(ans, ques12);
        ans = stringToIntadd(ans, ques13);
        ans = stringToIntadd(ans, ques14);
        ans = stringToIntadd(ans, ques15);
        ans = stringToIntadd(ans, ques16);
        ans = stringToIntadd(ans, ques17);
        ans = stringToIntadd(ans, ques18);
        ans = stringToIntadd(ans, ques19);
        ans = stringToIntadd(ans, ques20);
        return ans;
    }

    public int stringToIntadd(int ans, String m) {
        return ans + Integer.parseInt(m);
    }

}
