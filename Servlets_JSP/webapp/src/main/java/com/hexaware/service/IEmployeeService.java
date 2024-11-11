package com.hexaware.service;

import java.util.List;

import com.hexaware.entity.Employee;

public interface IEmployeeService {
	
	
		int 	addEmployee(Employee emp);
		
		List<Employee> 	 getAllEmployees();

}
