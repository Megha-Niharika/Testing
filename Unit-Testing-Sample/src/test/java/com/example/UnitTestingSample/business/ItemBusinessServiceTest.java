package com.example.UnitTestingSample.business;

import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.example.UnitTestingSample.data.ItemRepository;
import com.example.UnitTestingSample.data.SomeDataService;
import com.example.UnitTestingSample.model.Item;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import  org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class ItemBusinessServiceTest {

	@InjectMocks
	private ItemBusinessService business ;
	
	@Mock
	 private ItemRepository repository ;
	
//	@Before
//	
//	public void before()
//	{
//		business.setSomeDataService( dataServiceMock);
//	}
//	
	
	@Test
	public void retrieveAllItems_basic() {
		
		when(repository.findAll()).thenReturn(Arrays.asList(new Item(2,"Item2",10,10),new Item(3,"Item3",20,20)));	
		 List<Item> items = business.retrieveAllItems();
		 assertEquals(100,items.get(0).getValue());
		 assertEquals(400,items.get(1).getValue());
	}

	

}
