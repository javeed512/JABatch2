package com.hexaware.springrest.datajpa.service;

import java.util.List;

import com.hexaware.springrest.datajpa.entity.Employee;

public interface IEmployeeService {
	
	
		   public    Employee   addEmployee(Employee emp);
		   
		   public    Employee   updateEmployee(Employee emp);
		   
		   
		   public     Employee        getEmployeeById(long eid);
		   
		   
		   public    void       deleteEmployeeById(long eid);
		   
		   
		    public    List<Employee>   getAllEmployees();
		   
	

}
