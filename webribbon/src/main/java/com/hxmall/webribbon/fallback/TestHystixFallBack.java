package com.hxmall.webribbon.fallback;

import com.hxmall.webribbon.interfaces.TestFeignService;
import com.hxmall.webribbon.service.TestHystixService;
import org.springframework.stereotype.Component;

/**
 * Author Eirunye
 * Created by on 2018/9/4.
 * Describe
 */
@Component
public class TestHystixFallBack implements TestFeignService {
    @Override
    public String getWeb1ClientHello() {
        return "this is error data";
    }
}
