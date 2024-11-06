package com.hexaware.ems.dao;

import java.util.List;

import com.hexaware.ems.entity.Employee;

public interface IEmployeeDao {

	int  addEmp(Employee emp);
	int  updateEmployee(Employee emp);
	
	
	int  deleteByEid(int eid);
	
	Employee      getByEid(int eid);
	
	List<Employee>     getAllEmployees();

	
	
}
