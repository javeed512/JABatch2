package com.hexaware.ems.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.ems.entity.Employee;

public class EmployeeDaoImp implements IEmployeeDao {

	private Connection conn;

	public EmployeeDaoImp() {

		conn = DBUtil.getDBConnection();

	}

	@Override
	public int addEmp(Employee emp) {

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
				Date doj = rs.getDate("doj");

				Employee emp = new Employee(eid, ename, salary, doj);

				list.add(emp);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int updateEmployee(Employee emp) {
		// String update = "update Employees set ename=? , salary =? , doj =? where eid
		// = ?";
		// pstmt.setString(1,emp.getEname());
		return 0;
	}

	@Override
	public int deleteByEid(int eid) {

			int count =0;
		
		// delete query
		String deleteQuery ="delete from Employees where eid = ?";

		PreparedStatement pstmt;

		Employee emp = null;
		try {
			pstmt = conn.prepareStatement(deleteQuery);
			pstmt.setInt(1, eid);
			
			count = pstmt.executeUpdate();
		
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		// pstmt.setInt(1,eid);

		return count;
	}

	@Override
	public Employee getByEid(int eid) {

		String selectOne = "select * from Employees where eid = ?";
		PreparedStatement pstmt;

		Employee emp = null;
		try {
			pstmt = conn.prepareStatement(selectOne);

					pstmt.setInt(1, eid);
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int empId = rs.getInt("eid");
				String ename = rs.getString("ename");
				double salary = rs.getDouble("salary");
				Date doj = rs.getDate("doj");

				emp = new Employee(empId, ename, salary, doj);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}

}
