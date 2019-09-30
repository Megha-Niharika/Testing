package com.example.UnitTestingSample.business;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.UnitTestingSample.data.SomeDataService;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		SomeDataService dataServiceMock = mock(SomeDataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		
		
		business.setSomeDataService( dataServiceMock);
		int actualResult = business.calculateSumUsingDataService();
				int expectedResult =6;
				assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSumUsingDataServiceEmpty_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceStubEmpty());
		int actualResult = business.calculateSumUsingDataService();
				int expectedResult =0;
				assertEquals(expectedResult, actualResult);
	}

	
	@Test
	public void calculateSumUsingDataServiceOneElement_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceStubOneElement());
		int actualResult = business.calculateSumUsingDataService();
				int expectedResult =5;
				assertEquals(expectedResult, actualResult);
	}


}
