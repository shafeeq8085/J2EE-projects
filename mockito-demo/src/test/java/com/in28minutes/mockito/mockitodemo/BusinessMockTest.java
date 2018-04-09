package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BusinessMockTest {

	@Mock
	DataService service;
	
	@InjectMocks
	BusinessImp businessImpl;

	@Test
	public void testgreatestFromAll() {
		when(service.retrieveAll()).thenReturn(new int[] {1,2,3,4});
		
		int a = businessImpl.greatestFromAll();
		assertEquals(4, a);
	}

//	@Test
//	public void testgreatestFromAll() {
//		DataService service = mock(DataService.class);
//		when(service.retrieveAll()).thenReturn(new int[] {1,2,3,4});
//		
//		BusinessImp businessImpl = new BusinessImp(service);
//		int a = businessImpl.greatestFromAll();
//		assertEquals(4, a);
//	}

}

