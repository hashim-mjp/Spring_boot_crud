package com.hashim.crud.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashim.crud.entities.Employee;
import com.hashim.crud.repos.EmployeeRepository;

@Service
public class EmployeeServicesImpl implements EmployeeService {

	@Autowired
	EmployeeRepository emprepo;
	@Override
	public boolean register(Employee e) {
		
		emprepo.save(e);
		return true;
	}
	@Override
	public boolean login(Integer id, String password) {
		Optional<Employee> e = emprepo.findById(id);
		Employee emp;
		if(e.isPresent()) {
			emp=e.get();
			if(emp.getPassword().equals(password)) {
				return true;
			}
		}
		
		return false;
	}
	
	

}
