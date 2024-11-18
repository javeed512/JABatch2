package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestjpa.entities.Employee;

import jakarta.transaction.Transactional;

@SpringBootTest
class EmployeeServiceImpTest {

	@Autowired
	IEmployeeService service;

	@Test
	@Disabled
	void testAddEmployee() {

		Employee emp = new Employee(107, "Nihar", 80000);

		Employee e1 = service.addEmployee(emp);
		
			assertNotNull(e1);

	}

	@Test
	void testUpdateEmployee() {
		
		    Employee emp = new Employee(106, "shivam kumar", 70000);
			
		Employee e1 =    service.updateEmployee(emp);
		
		assertTrue(e1.getSalary() == 70000);

	}

	@Test
	void testGetEmployeeById() {
		
			
		
				Employee emp =	service.getEmployeeById(101);
		

					assertEquals("king",emp.getEname());
				
	}

	@Test
	void testGetAllEmployees() {

	}

	@Test
	void testDeleteByEname() {

	}

}
