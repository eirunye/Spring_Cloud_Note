package com.hxmall.web1client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Web1clientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Web1clientApplication.class, args);
	}
}
