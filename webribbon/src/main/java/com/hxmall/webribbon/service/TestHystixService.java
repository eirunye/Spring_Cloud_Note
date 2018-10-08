package com.hxmall.webribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Author Eirunye
 * Created by on 2018/9/4.
 * Describe
 */
@Service
public class TestHystixService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String getTestHello() {
        return restTemplate.getForObject("http://WEB1CLIENT/hello", String.class);
    }

    public String helloError() {
        return "Hi,get data error";
    }
}
