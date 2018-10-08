package com.hxmall.webribbon.controller;

import com.hxmall.webribbon.service.TestHystixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author Eirunye
 * Created by on 2018/9/4.
 * Describe
 */
@RestController
public class MyTestHystrixController {

    @Autowired
    TestHystixService testHystixService;


    @RequestMapping(value = "/getTest/Hystix")
    public String getHystixHello() {
        return testHystixService.getTestHello();
    }

}
