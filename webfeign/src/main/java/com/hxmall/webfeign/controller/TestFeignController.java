package com.hxmall.webfeign.controller;

import com.hxmall.webfeign.interfaces.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author Eirunye
 * Created by on 2018/9/4.
 * Describe
 */
@RestController
public class TestFeignController {

    @Autowired
    TestFeignService testFeignService;

    @RequestMapping("/getFeign/hello")
    public String getSayHello() {
        return "通过Feign绑定Web1Client" + testFeignService.getWeb1ClientHello();
    }
}
