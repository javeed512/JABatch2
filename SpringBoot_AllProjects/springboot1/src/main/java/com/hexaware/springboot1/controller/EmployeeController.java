package com.hexaware.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hexaware.springboot1.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	/*
	 * @RequestMapping(value = "/add", method = RequestMethod.POST) public String
	 * add(HttpServletRequest request, HttpServletResponse response , HttpSession
	 * session) {
	 * 
	 * int eid = Integer.parseInt(request.getParameter("eid")); String ename =
	 * request.getParameter("ename"); double salary =
	 * Double.parseDouble(request.getParameter("salary"));
	 * 
	 * Employee employee = new Employee(eid, ename, salary);
	 * 
	 * session.setAttribute("emp", employee);
	 * 
	 * 
	 * 
	 * return "display"; // forwarding request to display.jsp page
	 * 
	 * }
	 */
	
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute  Employee emp , HttpSession session) {
		
			session.setAttribute("emp", emp);
			
			// service.addEmp(emp);   ---> // dao.addEmp(emp);   // DB table
		
		return "display";  // forwarding request to display.jsp page
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
