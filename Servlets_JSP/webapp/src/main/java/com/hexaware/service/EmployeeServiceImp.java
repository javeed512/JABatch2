package com.hexaware.service;

import java.util.List;

import com.hexaware.entity.Employee;
import com.hexaware.repository.EmployeeRepoImp;
import com.hexaware.repository.IEmployeeRepo;

public class EmployeeServiceImp implements IEmployeeService {

	
	private IEmployeeRepo  repo;
	
	
	public  EmployeeServiceImp() {
		
			repo = new EmployeeRepoImp();
		
		
	}
	
	@Override
	public int addEmployee(Employee emp) {
		
		return  repo.addEmployee(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		
		return repo.getAllEmployees();
	}

}
