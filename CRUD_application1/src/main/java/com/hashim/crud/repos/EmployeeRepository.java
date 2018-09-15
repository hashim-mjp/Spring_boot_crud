package com.hashim.crud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hashim.crud.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
