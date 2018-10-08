package com.hxmall.webconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WebconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebconfigApplication.class, args);
	}
}
