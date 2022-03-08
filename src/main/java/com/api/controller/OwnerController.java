package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Owner;
import com.api.service.OwnerServiceImpl;

@RestController
@RequestMapping("/owner")
public class OwnerController {

	@Autowired
	private OwnerServiceImpl ownerServiceImpl;
    
	@PostMapping("/saveowner")
	public Owner saveOwner(@RequestBody Owner owner) {
		return ownerServiceImpl.saveOwner(owner);
	}

}
