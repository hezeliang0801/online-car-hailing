package com.hzl.apipassager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiPassagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPassagerApplication.class, args);

	}

}
