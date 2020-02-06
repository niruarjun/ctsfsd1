package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Item;
@Repository
public interface ItemRepository extends MongoRepository<Item, String> {

	
    
	public List<Item> findByItemName(String itemName);
	
	public List<Item> findByItemPrice(double itemPrice);

	//public List<Item> findByNameAndPrice(String itemName, double itemPrice);

	









}
