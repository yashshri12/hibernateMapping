package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Cart;
import com.api.service.CartServiceImpl;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartServiceImpl cartServiceImpl;
	
	@PostMapping("/saveCart")
	public Cart saveCart(@RequestBody Cart cart) {
		return cartServiceImpl.saveCart(cart);
	}
}
