package com.emiratesairline.airlinetodo.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	@RequestMapping("/items")
	public List<Item> index() {
		return itemService.getAllItems();
	}
	
	@RequestMapping("/items/{id}")
	public Item getItem(@PathVariable Long id) {
		return itemService.getItem(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/items")
	public void storeItem(@RequestBody Item item) {
		itemService.addItem(item);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/items/{id}")
	public void storeItem(@RequestBody Item item, @PathVariable Long id) {
		itemService.updateItem(id, item);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/items/{id}")
	public void deleteItem(@PathVariable Long id) {
		itemService.deleteItem(id);
	}
}
