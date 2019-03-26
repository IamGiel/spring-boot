package com.gel.springboot.basics.gelspringbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GelSpringbootBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(GelSpringbootBasicsApplication.class, args);
		
		for (String name : applicationContext.getBeanDefinitionNames())
			System.out.println(name);
	}

}
