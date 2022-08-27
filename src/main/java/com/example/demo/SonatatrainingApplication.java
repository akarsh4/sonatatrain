package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonatatrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonatatrainingApplication.class, args);
		
		AddInterface addition = new DefaultAdd();
		System.out.println(addition.add(10, 10));
	}

}
