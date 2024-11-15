package com.hexaware.springrest.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp  implements IEmployeeService {

	
		@Autowired
	  EmployeeRepository  repo;
	
	
	@Override
	public  Employee   addEmployee(Employee emp) {
		
		
			return repo.save(emp);
		
	}


	@Override
	public Employee updateEmployee(Employee emp) {
	
		return  repo.save(emp);
	}


	@Override
	public Employee getEmployeeById(long eid) {
		
		return   repo.findById(eid).orElse(null);
	}


	@Override
	public  void deleteEmployeeById(long eid) {

			repo.deleteById(eid);
		
	}


	@Override
	public List<Employee> getAllEmployees() {
	
		return   repo.findAll();
	}

}
