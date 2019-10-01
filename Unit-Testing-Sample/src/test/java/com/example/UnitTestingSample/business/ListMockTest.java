package com.example.UnitTestingSample.business;


import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;


public class ListMockTest {

	
	List mock =mock(List.class);
	@Test
	public void size_basic() {
		when(mock.size()).thenReturn(5);
		assertEquals(5,mock.size());
	}

	@Test
	public void returnDifferentValues() {
		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5,mock.size());
		assertEquals(10,mock.size());
	}
	
	@Test
	public void returnWithParameters()
	{
		when(mock.get(0)).thenReturn("Abhay");
		assertEquals("Abhay", mock.get(0));
		assertEquals(null, mock.get(1));
	}
	
	@Test
	public void returnWithGenericParameters()
	{
		when(mock.get(anyInt())).thenReturn("Abhay");
		assertEquals("Abhay", mock.get(0));
		assertEquals("Abhay", mock.get(1));
	}
}
