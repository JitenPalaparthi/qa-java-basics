package io.akalabs.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Springdemo1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springdemo1Application.class, args);
	   // Object byName = context.getBean("greet");
	  //  String byType = context.getBean(String.class);
	    //String byBoth = context.getBean("greet", String.class);
		/*
		 * System.out.println(byName); System.out.println(byType);
		 * System.out.println(byBoth);
		 */
	    
	    ApplicationContext context1 = 
	    		   new ClassPathXmlApplicationContext(
	    		      "SpringBeans.xml");
	    HelloWorld obj = (HelloWorld) context1.getBean("helloBean");
	    obj.output(); 
	    
	   ApplicationContext context3 = new AnnotationConfigApplicationContext(io.akalabs.springdemo1.MySampleBean.class);
	
	   Object heyBean = context3.getBean("hay");
	   System.out.println(heyBean);

	}
	@Bean
	public String greet() {
		return "Hello World";
	}
}


