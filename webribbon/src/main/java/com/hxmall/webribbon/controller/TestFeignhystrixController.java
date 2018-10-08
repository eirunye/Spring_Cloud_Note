package com.hxmall.webribbon.controller;

import com.hxmall.webribbon.interfaces.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author Eirunye
 * Created by on 2018/9/4.
 * Describe
 */
@RestController
public class TestFeignhystrixController {

    @Autowired
    TestFeignService testFeignService;

    @RequestMapping(value = "/getFeignHystrixHello")
    public String getFeignHystrixHello() {
        return testFeignService.getWeb1ClientHello();
    }
}
