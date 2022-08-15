package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
	@Autowired
	
	public DemoController() {}
	
	@GetMapping("/")
	public String greet() {
		return "Hello World!";
	}
	
	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}
	
	@GetMapping("/health")
	public String health() {
		return "ok";
	}
	
	@PostMapping("/employee")
	public String createEmployee(@RequestBody Employee emp) {
		return "Employee Successfully created in database";
	}
}
