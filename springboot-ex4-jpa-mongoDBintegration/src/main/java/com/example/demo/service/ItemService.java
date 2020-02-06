package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Item;

public interface  ItemService {
	public List<Item> getAllItem();
	public Item createItem(Item item);
	public Optional<Item> getItemById(String itemId);
	public void deleteBookById(String itemId);
	public void deleteAll();
	
	
	public  List<Item> findbyItemName(String itemName);
	public List<Item> findByItemPrice(double itemPrice);
	
}
