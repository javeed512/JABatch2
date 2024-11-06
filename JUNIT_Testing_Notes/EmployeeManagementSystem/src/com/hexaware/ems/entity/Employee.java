package com.hexaware.ems.entity;

import java.sql.Date;

public class Employee {
	
	private int eid;
	private String ename;
	private  double salary;
	private  Date  doj;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, double salary, Date doj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.doj = doj;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
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
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", doj=" + doj + "]";
	}
	
	
	
	
	
	

}
