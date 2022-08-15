package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = com.example.controller.DemoController.class)

public class Demo1Application {
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("-------------------------->>>>>>");
	}
}
// Convert three methods greet, ping, health to a separate class file and run
// POST localhost:8082/student/create
// GET localhost:8082/student/get/{id}
// PUT localhost:8082/student/update/{id}
// DELETE localhost:8082/student/delete/{id}

// RestController
// GET localhost:8081/
// GET localhost:8081/ping
// GET localhost:8081/helath