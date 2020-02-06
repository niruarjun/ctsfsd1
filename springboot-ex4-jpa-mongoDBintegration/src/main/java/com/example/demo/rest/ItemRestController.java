package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;
@RestController
@RequestMapping("/api")
public class ItemRestController {
	
	private ItemRepository itemRepository;
	
	@Autowired
	public ItemRestController(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}
	
	@PostMapping("/items")
	public Item createItem(@RequestBody Item item)
	{
		return itemRepository.insert(item);
	}
	@GetMapping("/items")
	public List<Item> getAllItem()
	{
		return itemRepository.findAll();
	}
	@GetMapping("/items/{itemId}")
	public Optional<Item> getItemByd(@PathVariable String itemId)
	{
		return itemRepository.findById(itemId) ;
	
	}
	@GetMapping("/items/find/{itemName}")
	public List<Item> findbyItemName(@PathVariable String itemName){
		return itemRepository.findByItemName(itemName);
		
	}
	@GetMapping("/items/findid/{itemPrice}")
	public List<Item> findbyItemPrice(@PathVariable double itemPrice){
		return itemRepository.findByItemPrice(itemPrice);
		
	}
	@PutMapping("/items")
	public Item updateCart(@RequestBody Item item)
	
	{	
		return  itemRepository.save(item);
	}
	@DeleteMapping("/delItem/{itemId}")
	public void deleteBookById(@PathVariable String itemId) {
		itemRepository.deleteById(itemId);
	}
	@DeleteMapping("/delItem")
	public void deleteAll() {
		// TODO Auto-generated method stub
		itemRepository.deleteAll();
	}
	@GetMapping("/items/find/{itemName}{itemSize}")
	public List<Item> findByNameAndPrice(String itemName, double itemPrice)
	{
		return itemRepository.findByNameAndPrice(itemName, itemPrice);
		
	}
}
