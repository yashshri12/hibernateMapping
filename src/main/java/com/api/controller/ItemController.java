package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Item;
import com.api.service.ItemServiceImpl;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemServiceImpl itemserviceImpl;
	
	@PostMapping("/saveItem")
	public Item saveItem(@RequestBody Item item) {
		return itemserviceImpl.saveItem(item);
	}
}
