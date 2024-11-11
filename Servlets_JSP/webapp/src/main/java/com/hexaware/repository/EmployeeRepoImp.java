package com.hexaware.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.entity.Employee;

public class EmployeeRepoImp implements IEmployeeRepo {

	
	  Connection conn = null;
	  
	  
	  public EmployeeRepoImp() {
		  
		  	conn = DBUtil.getDBConnection();
		  
		  
	  }
	
	
	@Override
	public int addEmployee(Employee emp) {
		int count = 0;

		String insert = "insert into Employees(eid,ename,salary,doj) values(?,?,?,current_date)";

		try {
			PreparedStatement pstmt = conn.prepareStatement(insert);

			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEname());
			pstmt.setDouble(3, emp.getSalary());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();

		String selectAll = "select * from Employees ";

		try {
			PreparedStatement pstmt = conn.prepareStatement(selectAll);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int eid = rs.getInt("eid");
				String ename = rs.getString("ename");
				double salary = rs.getDouble("salary");
				

				Employee emp = new Employee();
						emp.setEid(eid);
						emp.setEname(ename);
						emp.setSalary(salary);
						

				list.add(emp);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
