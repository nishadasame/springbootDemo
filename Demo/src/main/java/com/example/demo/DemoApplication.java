package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class DemoApplication {
	
	
	

	public static void main(String[] args) {
		System.out.println("HelLo from Demo");
		
		
	ApplicationContext context=	SpringApplication.run(DemoApplication.class, args);
		
		User obj= context.getBean(User.class);;
		obj.code();
	}

}
