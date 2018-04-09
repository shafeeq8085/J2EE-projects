package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListMockTest {

	@Test
	public void testList() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		
		assertEquals(10, listMock.size());

	}

	@Test
	public void testListwithmultiple() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
		assertEquals(20, listMock.size());

	}

	@Test
	public void testListwithgeneric() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("Generic");
		
		assertEquals("Generic", listMock.get(100));

	}

	@Test
	public void testListwithSpecific() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Specific 0");
		
		assertEquals("Specific 0", listMock.get(0));

	}

	
}
