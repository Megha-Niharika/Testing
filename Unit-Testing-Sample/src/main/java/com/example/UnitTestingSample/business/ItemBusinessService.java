package com.example.UnitTestingSample.business;

import org.springframework.stereotype.Component;

import com.example.UnitTestingSample.model.Item;


@Component
public class ItemBusinessService {

	public Item retrieveHardcodedItem() {
		// TODO Auto-generated method stub
		return new  Item(1,"football",10,100);
	}

}
