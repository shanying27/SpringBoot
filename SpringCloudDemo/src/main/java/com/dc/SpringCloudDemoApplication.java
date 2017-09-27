package com.dc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudDemoApplication {

//	@RequestMapping("/")
//	public String testq(){
//		return "你好  ";
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoApplication.class, args);
	}
}
