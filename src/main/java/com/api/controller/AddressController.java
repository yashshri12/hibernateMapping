package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Address;
import com.api.service.AddressServiceImpl;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressServiceImpl addressServiceImpl;

   public Address saveAddress(@RequestBody Address address) {
	   return addressServiceImpl.saveAddress(address);
   }
}
