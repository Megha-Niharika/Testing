package com.example.UnitTestingSample.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UnitTestingSample.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
