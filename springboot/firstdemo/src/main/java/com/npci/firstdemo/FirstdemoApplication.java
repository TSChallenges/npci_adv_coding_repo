package com.npci.firstdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstdemoApplication {

	public static void main(String[] args) {

		System.out.println("This is beginning of the my Spring Boot Application........");
		SpringApplication.run(FirstdemoApplication.class, args);
	}

}
