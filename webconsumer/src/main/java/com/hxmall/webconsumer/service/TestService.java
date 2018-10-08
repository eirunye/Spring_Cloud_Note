package com.hxmall.webconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Author Eirunye
 * Created by on 2018/9/4.
 * Describe
 */
@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    public String getTestData() {
        return restTemplate.getForObject("http://WEB1CLIENT/hello", String.class);
    }

    public String getTestSay(){
        return restTemplate.getForObject("http://WEBCLIENT/say",String.class);
    }

}
