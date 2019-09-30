package com.example.UnitTestingSample.business;

import org.junit.Test;

import static org.junit.Assert.*;
import com.example.UnitTestingSample.data.SomeDataService;

class SomeDataServiceStub implements SomeDataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3};
	}
}

class SomeDataServiceStubEmpty implements SomeDataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {};
	}
}

class SomeDataServiceStubOneElement implements SomeDataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {5};
	}
}

public class SomeBusinessStubTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceStub());
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


