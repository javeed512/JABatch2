package com.hexaware.ems.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.hexaware.ems.dao.EmployeeDaoImp;
import com.hexaware.ems.dao.IEmployeeDao;
import com.hexaware.ems.entity.Employee;

class EmployeeDaoImpTest {

	static IEmployeeDao dao;

	@BeforeAll
	public static void beforeAll() {

		dao = new EmployeeDaoImp();

	}

	@Test
	@Disabled
	void testAddEmp() {

		Employee emp = new Employee();
		emp.setEid(201);
		emp.setEname("Raj");
		emp.setSalary(80000);

		int count = dao.addEmp(emp);

		assertEquals(1, count);

	}

	@Test
	@Disabled
	void testDeleteByEid() {
		
		int count =	dao.deleteByEid(0);
		
		assertTrue( count > 0);

	}

	@Test
	void testGetByEid() {
		
		Employee emp =		dao.getByEid(201);
		
		assertNotNull(emp);
		
		assertEquals("Raj", emp.getEname());

	}

}
