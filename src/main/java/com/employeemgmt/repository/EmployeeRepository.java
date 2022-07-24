package com.employeemgmt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemgmt.model.*;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();
}
