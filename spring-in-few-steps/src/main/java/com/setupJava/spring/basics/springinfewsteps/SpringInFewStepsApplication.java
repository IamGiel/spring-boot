package com.setupJava.spring.basics.springinfewsteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;

@SpringBootApplication // this automatically scans where the package is and its sub packages
public class SpringInFewStepsApplication {
	
	// To wire beans:
	// what are beans? @component
	// what are dependencies for the bean? @AutoWired
	// Where to search for  beans?

	public static void main(String[] args) {
		
		// Spring application context will maintain all the beans
		ApplicationContext applicationContext = SpringApplication.run(SpringInFewStepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6 }, 3);
		
		System.out.println(result);
		
		// OUTPUT: 
//		com.setupJava.spring.basics.springinfewsteps.QuickSortAlgorithm@518caac3
//		[I@68034211
//		3
	}

}
