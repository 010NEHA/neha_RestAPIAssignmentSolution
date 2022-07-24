package com.employeemgmt.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeemgmt.model.*;
import com.employeemgmt.repository.RoleRepository;
import com.employeemgmt.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;

	@Override
	@Transactional
	public List<Role> findAll() {
		List<Role> roles = roleRepository.findAll();
		return roles;
	}

	@Override
	@Transactional
	public Optional<Role> findById(int theId) {
		return roleRepository.findById(theId);
	}

	@Override
	@Transactional
	public void save(Role theRole) {
		roleRepository.save(theRole);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		roleRepository.deleteById(theId);
	}

	@Override
	public Optional<Role> findByName(String name) {
		// TODO Auto-generated method stub
		return null;

}
