package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.User;
import com.api.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userserviceImpl;
	
	@PostMapping("/saveuser")
	public User saveUser(@RequestBody User user) {
		return userserviceImpl.saveUser(user);
	}
	
	@GetMapping("/finduser/{n}")
	public List<User> findByName(@PathVariable("n") String name) {
		
		return userserviceImpl.findUserByName(name);
	}
	
	@GetMapping("/findnamecontains/{n}")
	public List<User> findNameStartsWith(@PathVariable("n") String name) {
		
		return userserviceImpl.findName(name);
	}
}
