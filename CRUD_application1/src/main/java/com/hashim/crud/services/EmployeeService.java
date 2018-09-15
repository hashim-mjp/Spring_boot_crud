package com.hashim.crud.services;

import com.hashim.crud.entities.Employee;

public interface EmployeeService {
	public boolean register(Employee e);

	public boolean login(Integer id, String password);

}
