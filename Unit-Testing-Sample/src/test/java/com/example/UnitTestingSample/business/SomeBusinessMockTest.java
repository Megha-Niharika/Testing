package com.example.UnitTestingSample.business;

import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.example.UnitTestingSample.data.SomeDataService;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import  org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {

	@InjectMocks
	SomeBusinessImpl business ;
	
	@Mock
	SomeDataService dataServiceMock = mock(SomeDataService.class);
	
//	@Before
//	
//	public void before()
//	{
//		business.setSomeDataService( dataServiceMock);
//	}
//	
	
	@Test
	public void calculateSumUsingDataService_basic() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});	
		assertEquals(6, business.calculateSumUsingDataService());
	}

	@Test
	public void calculateSumUsingDataServiceEmpty_basic() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(0, business.calculateSumUsingDataService());
	}

	
	@Test
	public void calculateSumUsingDataServiceOneElement_basic() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
		assertEquals(5, business.calculateSumUsingDataService());
	}


}
