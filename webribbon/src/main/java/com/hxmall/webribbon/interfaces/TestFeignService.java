package com.hxmall.webribbon.interfaces;

import com.hxmall.webribbon.fallback.TestHystixFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author Eirunye
 * Created by on 2018/9/4.
 * Describe
 */
@FeignClient(value = "web1client",fallback = TestHystixFallBack.class)  //绑定提供者
public interface TestFeignService {

    @RequestMapping(value = "/hello")
    String getWeb1ClientHello();
}
