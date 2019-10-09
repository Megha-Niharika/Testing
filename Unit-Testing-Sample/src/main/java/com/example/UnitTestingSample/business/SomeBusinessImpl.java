package com.example.UnitTestingSample.business;

import java.util.Arrays;
import java.util.OptionalInt;

import com.example.UnitTestingSample.data.SomeDataService;

public class SomeBusinessImpl {

	
	SomeDataService someDataService;
	
	public int calculateSum(int [] data)
	{
		return	Arrays.stream(data).reduce(Integer::sum).orElse(0);
		
//		int sum=0;
//		for(int value:data)
//		{
//			sum+=value;
//		}
//		return sum;
	}
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}


	public int calculateSumUsingDataService()
	{
		int sum=0;
		int[] data = someDataService.retrieveAllData();
		for(int value:data)
		{
			sum+=value;
		}
		return sum;
	}
}

