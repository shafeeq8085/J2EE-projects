package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessStubTest {

	@Test
	public void testgreatestFromAll() {
		BusinessImp businessImpl = new BusinessImp(new DemoDataService());
		int a = businessImpl.greatestFromAll();
		assertEquals(2, a);
	}

}

class DemoDataService implements DataService{

	@Override
	public int[] retrieveAll() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4};
	}
	
}
