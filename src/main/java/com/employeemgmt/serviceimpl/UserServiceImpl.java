package com.employeemgmt.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeemgmt.*;
import com.employeemgmt.model.User;
import com.employeemgmt.repository.UserRepository;
import com.employeemgmt.service.UserService;

@Service
public class UserServiceImpl implements UserRepository {

	@Autowired
	UserRepository userRepository;

	@Transactional
	public List<User> findAll() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Transactional
	public Optional<User> findById(long theId) {
		return userRepository.findById(theId);
	}

	@Transactional
	public void save(User theUser) {
		userRepository.save(theUser);
	}

	@Transactional
	public void deleteById(long theId) {
		userRepository.deleteById(theId);
	}

	@Transactional
	public Optional<Optional<User>> findByUserName(String userName) {
		return Optional.ofNullable(userRepository.findByUserName(userName));
	}

}
