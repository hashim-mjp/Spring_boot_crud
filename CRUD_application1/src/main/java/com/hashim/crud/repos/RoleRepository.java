package com.hashim.crud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hashim.crud.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
