package com.sonata.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.sonata.mvc.controller", "com.sonata.mvc"})
public class CartDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartDetailsApplication.class, args);
	}

}
