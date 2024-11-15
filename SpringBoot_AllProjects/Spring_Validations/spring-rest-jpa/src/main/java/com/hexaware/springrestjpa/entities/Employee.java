package com.hexaware.springrestjpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "employee_info")
public class Employee {

	@Id
	@Min(value = 100 , message = "eid should be min 100 or  greater than ")
	@Max(value = 999 , message = "eid should be max 999 or  less than")
	private long eid;
	
	@Pattern(regexp = "[A-Z][a-z]{3}",message = "Ename must begin with Uppercase and should have 4 chars")
	private String ename;
	
	
	private double salary;

	public Employee() {
		super();
	}

	public Employee(long eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
