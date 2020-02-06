package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;
@Service
public class ItemServiceImpl implements ItemService {
	
	private ItemRepository itemRepository;
	private Object findByAuthorAndBookName;
	
	@Autowired
	public ItemServiceImpl(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	@Override
    @Transactional
	public List<Item> getAllItem() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	@Transactional
	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.insert(item);
	}

	@Override
	
	public Optional<Item> getItemById(String itemId) {
		// TODO Auto-generated method stub
		return itemRepository.findById(itemId);
	}

	@Override
	public void deleteBookById(String itemId) {
		itemRepository.deleteById(itemId);
	}

	@Override
	@Transactional
	public void deleteAll() {
		
		itemRepository.deleteAll();
	}

	@Override
	public List<Item> findbyItemName(String itemName) {
		// TODO Auto-generated method stub
		return itemRepository.findByItemName(itemName);
	}

	@Override
	public List<Item> findByItemPrice(double itemPrice) {
		// TODO Auto-generated method stub
		return itemRepository.findByItemPrice(itemPrice);
	}


	
	

	
	


	/*public List<Item> findbyItemname(String itemName) {
		
		return itemRepository.findOne(itemName);
	}*/

	

	

}
