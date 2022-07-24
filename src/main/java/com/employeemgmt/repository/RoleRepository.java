package com.employeemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemgmt.model.*;

public interface RoleRepository extends JpaRepository<Role, Integer> {


}
