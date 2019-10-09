package com.example.UnitTestingSample.datalayer;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.UnitTestingSample.data.ItemRepository;
import com.example.UnitTestingSample.model.Item;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

	@Autowired
	ItemRepository repository;
	
	
	@Test
	public void testFindAll()
	{
		List<Item> items = repository.findAll();
		assertEquals(3,items.size());
	}
	
}
