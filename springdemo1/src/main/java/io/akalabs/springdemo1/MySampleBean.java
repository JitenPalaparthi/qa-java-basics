package io.akalabs.springdemo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.*;
import javax.validation.constraints.Max;


@Configuration
public class MySampleBean{
	private int age;
	@Bean
	@Scope("prototype")
	public String hay() {
		return "Hello World through a bean!";
	}
	
	@Bean
	@Max(150)
	public void setAge(int age) {
		this.age = age;
	}
}