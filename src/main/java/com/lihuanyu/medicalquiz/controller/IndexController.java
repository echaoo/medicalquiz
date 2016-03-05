package com.lihuanyu.medicalquiz.controller;

import com.lihuanyu.medicalquiz.model.Datum;
import com.lihuanyu.medicalquiz.services.CreateMessage;
import com.lihuanyu.medicalquiz.services.CreateTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by echao on 2016/3/5.
 */
@Controller
public class IndexController {

    @Autowired
    private CreateMessage createMessage;

    @Autowired
    private CreateTest createTest;

    @RequestMapping("/")
    public String essencialMessage(int id, int admissionnum, String name, int age, int number, char sex, String birth) {
        String result = createMessage.saveMessage(id, admissionnum, name, age, number, sex, birth);
        if (result.equals("success")) {
            return "test";//跳转到后面的测试页面
        } else {
            return "false";//返回错误页面，表单提交失败
        }
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(Datum datum) {
        String result = createTest.saveTest(datum);
        int score = datum.getScore();
        if(result.equals("success")){
            if(score<=2){
                return "test5";//第四项成绩不好，进入第五项测试
            }else {
                return "finish";//第四项成绩大于2个，则结束测试
            }
        }
        return "success";
    }
}
