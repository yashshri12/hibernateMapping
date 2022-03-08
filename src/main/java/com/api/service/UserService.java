package com.api.service;

import java.util.List;

import com.api.model.User;

public interface UserService {
  public User saveUser(User user);
  public List<User> findUserByName(String name);
  public List<User> findName(String name);
	
}
