package com.bootcamp.businessReto2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BusinessReto2Application {

	public static void main(String[] args) {
		SpringApplication.run(BusinessReto2Application.class, args);
	}

}
