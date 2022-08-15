package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Demo1Application {

	@RequestMapping("/")
	String greet() {
		return "Hello World!";
	}
	
	@RequestMapping("/ping")
	String ping() {
		return "pong";
	}
	
	@RequestMapping("/health")
	String health() {
		return "ok";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
// Convert three methods greet, ping, health to a separate class file and run
