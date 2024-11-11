package com.hexaware.repository;

import java.util.List;

import com.hexaware.entity.Employee;

public interface IEmployeeRepo {
	
	
	int 	addEmployee(Employee emp);
	
	List<Employee> 	 getAllEmployees();

}
