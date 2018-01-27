package com.emiratesairline.airlinetodo.items;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service	
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	// Retrieve all rows from table and populate list with objects
	public List<Item> getAllItems() {
		List<Item> items = new ArrayList<>();
		itemRepository.findAll().forEach( items::add );
		
		return items;
	}
	
	// Retrieves one row from table based on given id
	public Item getItem(Long id) {
		return itemRepository.findOne(id);
	
	}
	
	// Inserts row into table 
	public void addItem(Item todoItem) {
		itemRepository.save(todoItem);
	}
	
	// Updates row in table
	public void updateItem(Long id, Item todoItem) {
		itemRepository.save(todoItem);
	}
	
	// Removes row from table
	public void deleteItem(Long id) {
		itemRepository.delete(id);
	}
}
