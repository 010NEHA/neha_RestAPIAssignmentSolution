package com.employeemgmt.repository;


import java.util.List;
import java.util.Optional;

import com.employeemgmt.model.*;


public interface UserRepository {
	
	public List<User> findAll();

	public Optional<User> findById(long theId);

	public User save(User theUser);

	public void deleteById(long theId);

	public Optional<User> findByUserName(String userName);
}


