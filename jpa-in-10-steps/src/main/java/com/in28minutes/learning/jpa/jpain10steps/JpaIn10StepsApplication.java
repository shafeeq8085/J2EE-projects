package com.in28minutes.learning.jpa.jpain10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.in28minutes.learning.jpa.jpain10steps.service","com.in28minutes.learning.jpa.jpain10steps"})
public class JpaIn10StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaIn10StepsApplication.class, args);
	}
}
