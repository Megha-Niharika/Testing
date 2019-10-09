package com.example.UnitTestingSample.controller;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.UnitTestingSample.business.ItemBusinessService;
import com.example.UnitTestingSample.model.Item;

import  static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import  static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {
	
	@Autowired
	 private MockMvc mockMvc;
	@MockBean
	private ItemBusinessService businessService;
	
	
	@Test
	public void dummy_item() throws Exception
	{
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("/dummy_item")
				.accept(MediaType.APPLICATION_JSON);
		
	       MvcResult result =	mockMvc.perform(request)
			.andExpect(status().isOk())
			.andExpect(content().json("{\"id\":1,\"name\":\"ball\",\"quantity\":100,\"price\":10}"))
			.andReturn();
	
	//JSONAssert.assertEquals(expected, actual, strict);
	//assertEquals("helloworld",result.getResponse().getContentAsString());
		 
	}
	
	@Test
	public void itemfrombusinessService() throws Exception
	{
		
		
		when(businessService.retrieveHardcodedItem()).thenReturn(
				new Item(2,"Item2",10,10));
		RequestBuilder request = MockMvcRequestBuilders
				.get("/item-from-business-service")
				.accept(MediaType.APPLICATION_JSON);
		
	       MvcResult result =	mockMvc.perform(request)
			.andExpect(status().isOk())
			.andExpect(content().json("{id:2,name:Item2,quantity:10,price:10}"))
			.andReturn();
	}
	
//	@Test
//	public void dummy_item() throws Exception
//	{
//		
//		RequestBuilder request = MockMvcRequestBuilders
//				.get("/dummy_item")
//				.accept(MediaType.APPLICATION_JSON);
//		
//	       MvcResult result =	mockMvc.perform(request)
//			.andExpect(status().isOk())
//			.andExpect(content().json("{\"id\":1,\"name\":\"ball\",\"quantity\":100,\"price\":10}"))
//			.andReturn();
//	
//	//JSONAssert.assertEquals(expected, actual, strict);
//	//assertEquals("helloworld",result.getResponse().getContentAsString());
//		 
//	}
	
	@Test
	public void retrieveAllItems_basic() throws Exception
	{
		
		
		when(businessService.retrieveAllItems()).thenReturn(
				Arrays.asList(new Item(2,"Item2",10,10))
				);
		RequestBuilder request = MockMvcRequestBuilders
				.get("/all-items")
				.accept(MediaType.APPLICATION_JSON);
		
	       MvcResult result =	mockMvc.perform(request)
			.andExpect(status().isOk())
			.andExpect(content().json("[{id:2,name:Item2,quantity:10,price:10}]"))
			.andReturn();
	}
	
	
}
