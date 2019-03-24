package com.setupJava.spring.basics.springinfewsteps;

import org.springframework.stereotype.Component;

@Component
public interface SortAlgorithm {
	public int[] sort(int[] numbers);
}