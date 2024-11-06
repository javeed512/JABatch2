package com.hexaware.ems.test;



import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.hexaware.ems.entity.Employee;
import com.hexaware.ems.service.EmployeeServiceImp;
import com.hexaware.ems.service.IEmployeeService;

class EmployeeServiceImpTest {

	
	static IEmployeeService service;
	
	@BeforeAll  
	public static void beforeAll() {
		
		service = new EmployeeServiceImp();
		
	}
	
	
	
	@Test
	@Disabled
	void testAddEmp() {
		
		Employee emp = new Employee(102, "satyam", 45000, null);
		
		int count = service.addEmp(emp);
		
		assertTrue(count > 0);
		
	}

	@Test
	void testGetAllEmployees() {
		
			List<Employee>  list =	service.getAllEmployees();
		
				assertNotNull(list);
			
	}

	@Test
	void testValidateEmp() {
		
		Employee emp = new Employee(100, "timmy", 25000, null);
		
		boolean isValid = EmployeeServiceImp.validateEmp(emp);
	
			assertTrue(isValid);
		
	}

	@Test
	void testGetByEid() {
		
			Employee emp = service.getByEid(101);
		
			assertEquals(101, emp.getEid());
		
	}

}
