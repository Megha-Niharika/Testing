package com.example.UnitTestingSample.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import  static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import  static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@RunWith(SpringRunner.class)
@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {
	
	@Autowired
	 private MockMvc mockMvc;
	
	@Test
	public void hello() throws Exception
	{
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("/hello")
				.accept(MediaType.APPLICATION_JSON);
	MvcResult result =	mockMvc.perform(request)
			.andExpect(status().isOk())
			.andExpect(content().string("helloworld"))
			.andReturn();
	
	
	//assertEquals("helloworld",result.getResponse().getContentAsString());
		 
	}
	
}
