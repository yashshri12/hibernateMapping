package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	// @Query(value="SELECT u FROM User u WHERE u.name=:n")
	 @Query(value="SELECT * FROM user_tb u WHERE u.name=:n", nativeQuery = true)
	public List<User> findByName(@Param("n") String name);
	 
      
	 public List<User> findByNameContains( String name);
	
//	public List<User> findByName(String name);

}
