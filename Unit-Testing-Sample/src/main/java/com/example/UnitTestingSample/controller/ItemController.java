package com.example.UnitTestingSample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UnitTestingSample.model.Item;
@RestController
public class ItemController {
	
		@GetMapping("/dummy_item")
		public Item dummyItem()
		{
			return new Item(1,"ball",10,100);
		}
	
}



