package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binser = context.getBean(BinarySearchImpl.class);
		int a = binser.binarySearch(new int[] {1,2,3}, 3);
		System.out.println("Final Number:"+a);
	}
}
