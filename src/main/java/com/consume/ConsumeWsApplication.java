package com.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumeWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeWsApplication.class, args);
	}

}
