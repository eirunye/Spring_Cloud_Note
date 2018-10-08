package com.hxmall.webzuul;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebzuulApplication.class, args);
	}
}
