package com.hexaware.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.hexaware.entity.Employee;
import com.hexaware.service.EmployeeServiceImp;
import com.hexaware.service.IEmployeeService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private  IEmployeeService service;

    /**
     * Default constructor. 
     */
    public EmployeeServlet() {

    		service = new EmployeeServiceImp();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter   out =	response.getWriter();
			
							response.setContentType("text/html");
			
					out.print("Hello Friends!");
					out.print("<h1 style='background-color:red'>WELCOME TO SERVLET</h1>");
					
					
		String key = request.getParameter("add");
				
		
			RequestDispatcher rd =	request.getRequestDispatcher("/view/success.jsp");
			
				
				HttpSession session =	request.getSession();
				

			if( key != null) {
				
				int eid = Integer.parseInt(request.getParameter("eid"));
				
				String ename =		request.getParameter("ename");
				
				double  salary  =  Double.parseDouble(request.getParameter("salary"));
		
				Employee emp = new Employee(eid, ename, salary);
		
				out.print(emp);
				
				// service.addEmp(emp);  // --> dao.addEmp(emp);  ---> JDBC ---> DB
				
			int count =	service.addEmployee(emp);
				
			out.print(count +"  Record inserted successfully..");
				
			}
			
			else {
				
				
				
			List<Employee>  list =	service.getAllEmployees();
				
				
				//	list.forEach((e1)->{  out.print(e1 +"<br>"); });
			
					session.setAttribute("empList", list );
			
				rd.forward(request, response);
					
			}
					
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
