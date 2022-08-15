package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
