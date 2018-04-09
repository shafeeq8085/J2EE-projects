package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	private SortAlgorithm sortAlg;
	
	@Autowired
	public BinarySearchImpl(SortAlgorithm sortAlg) {
		super();
		this.sortAlg = sortAlg;
	}

	public int binarySearch(int[] numbers, int number){
		
		int result = sortAlg.sort(numbers); 
		
		return result;
	}
	
}
