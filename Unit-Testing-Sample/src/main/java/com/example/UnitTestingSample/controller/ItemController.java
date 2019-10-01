package com.example.UnitTestingSample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UnitTestingSample.business.ItemBusinessService;
import com.example.UnitTestingSample.model.Item;
@RestController
public class ItemController {
	
	
	@Autowired
	 private ItemBusinessService businessService;
	
	
	
		@GetMapping("/dummy_item")
		public Item dummyItem()
		{
			return new Item(1,"ball",10,100);
		}
		

		@GetMapping("/item-from-business-service")
		public Item item_from()
		{
			return businessService.retrieveHardcodedItem() ;
		}
	
	
}



