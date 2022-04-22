package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.api.model.Cart;
import com.api.service.CartServiceImpl;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

	@Autowired
	private CartServiceImpl cartServiceImpl;
	
	@PostMapping("/saveCart")
	public Cart saveCart(@RequestBody Cart cart) {
		return cartServiceImpl.saveCart(cart);
	}
}
