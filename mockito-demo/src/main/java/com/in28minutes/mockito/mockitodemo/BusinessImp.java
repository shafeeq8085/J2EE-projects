package com.in28minutes.mockito.mockitodemo;

public class BusinessImp {

	private DataService dataService;
	
	public BusinessImp(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	int greatestFromAll() {
		
		int[] numbers = dataService.retrieveAll();
		int biggest = Integer.MIN_VALUE;
		
		for (int i : numbers) {
			
			if (i > biggest) {
				biggest = i;
			}
		}
		
		return biggest;
		
	}
	
}

