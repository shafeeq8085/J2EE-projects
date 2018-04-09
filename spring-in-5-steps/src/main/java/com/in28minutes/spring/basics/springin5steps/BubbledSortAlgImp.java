package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbledSortAlgImp implements SortAlgorithm{

	@Override
	public int sort(int[] numbers) {
		// TODO Auto-generated method stub
		return 2;
	}

}
