package com.example.UnitTestingSample.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.UnitTestingSample.data.ItemRepository;
import com.example.UnitTestingSample.model.Item;


@Component
public class ItemBusinessService {

	
	@Autowired
	private ItemRepository repository;
	
	public Item retrieveHardcodedItem() {
		// TODO Auto-generated method stub
		return new  Item(1,"football",10,100);
	}
	
	public List<Item> retrieveAllItems()
	{
		
		List<Item> items = repository.findAll();
		for(Item item:items)
		{
			item.setValue(item.getPrice()* item.getQuantity());
		}
;		return items;
	
		
	}

}
