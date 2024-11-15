package com.hexaware.springrest.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
		
	
			@Autowired
			IEmployeeService service;
	
	
	
	 @PostMapping("/add")
	  public  Employee    add(@RequestBody Employee emp) {
		  
		  
		      return  service.addEmployee(emp);
		  
	  }
	
	  
	  
	  
	  @PutMapping("/update")
	  public  Employee   update(@RequestBody Employee emp) {
		  
		  
		  return  service.updateEmployee(emp);
		  
	  }
	
	  
	  @DeleteMapping("/delete/{eid}")
	  public String   delete(@PathVariable  int eid) {
		  
		 
		  			service.deleteEmployeeById(eid);
		  			
		  return "Recored deleted for Eid "+eid;
		  
	  }
	  
	  
	  @GetMapping("/getbyid/{eid}")
	  public  Employee   getById(@PathVariable int eid) {
		  
		  return service.getEmployeeById(eid);
		  
	  }
	  
	  
	  @GetMapping("/getall")
	  public List<Employee>  getAll(){
		  
		   return  service.getAllEmployees();
		  
	  }
	  
	
	
	
	
	
	
	
	

}
