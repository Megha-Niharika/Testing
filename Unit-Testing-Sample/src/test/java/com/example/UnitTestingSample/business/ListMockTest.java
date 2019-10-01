package com.example.UnitTestingSample.business;


import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.never;;


public class ListMockTest {

	
	List <String> mock =mock(List.class);
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
	
	
	@Test
	public void verificationBasics()
	{
		String value1 = mock.get(0);
		String value2 = mock.get(1);
		
		
		verify(mock).get(0);
		verify(mock,never()).get(2);		
		verify(mock,times(2)).get(anyInt());	
		verify(mock,atLeast(1)).get(anyInt());	
		verify(mock,atLeastOnce()).get(anyInt());	
		verify(mock,atMost(2)).get(anyInt());	
	}
}
