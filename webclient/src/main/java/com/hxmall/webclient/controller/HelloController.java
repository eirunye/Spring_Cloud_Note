package com.hxmall.webclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author Eirunye
 * Created by on 2018/9/4.
 * Describe
 */
@RestController
public class HelloController {

    @RequestMapping("/say")
    public String getSay(){
        return "ni hao!";
    }
}
