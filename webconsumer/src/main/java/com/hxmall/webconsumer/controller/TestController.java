package com.hxmall.webconsumer.controller;

import com.hxmall.webconsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author Eirunye
 * Created by on 2018/9/4.
 * Describe
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/data")
    public String getTestData() {
        return testService.getTestData();
    }

    @RequestMapping("/say")
    public String getTestSay() {
        return testService.getTestSay();
    }
}
