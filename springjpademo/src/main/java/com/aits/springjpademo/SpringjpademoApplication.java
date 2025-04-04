package com.aits.springjpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "controllers")
public class SpringjpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpademoApplication.class, args);
	}

}
