package com.hexaware.ems.service;

import java.util.List;

import com.hexaware.ems.entity.Employee;
import com.hexaware.ems.exceptions.EmployeeNotFoundException;

public interface IEmployeeService {
	
		
			int  addEmp(Employee emp);
			
			int updateEmployee(Employee emp);
			
			int  deleteByEid(int eid); // throws EmployeeNotFoundException;
			
			Employee      getByEid(int eid) throws EmployeeNotFoundException;
			
			List<Employee>     getAllEmployees();
	
	

}
