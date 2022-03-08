package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.User;
import com.api.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> findUserByName(String name) {
	   
		return userRepository.findByName(name);
	}

	@Override
	public List<User> findName(String name) {
		
		return userRepository.findByNameContains(name);
	}

}
