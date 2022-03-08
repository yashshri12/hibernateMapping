package com.api.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.model.Address;
import com.api.model.User;
import com.api.service.UserServiceImpl;

@SpringBootTest
public class UserTest {
    @Autowired
	private UserServiceImpl userServiceImpl;

	@Test
	public void submitUser() {
//		User user = new User();
//		user.setName("yash");
//
//		Address address = new Address();
//		address.setUser_address("Ujjain");
//
//		user.setAddress(address);
//		
//	  User savedUser =userServiceImpl.saveUser(user);
//	  
//	  assertThat(savedUser.getUser_id()).isGreaterThan(0);

		User user =new User();
		User response =new User();
		
		when(userServiceImpl.saveUser(user)).thenReturn(response);
		
		
	}
}
