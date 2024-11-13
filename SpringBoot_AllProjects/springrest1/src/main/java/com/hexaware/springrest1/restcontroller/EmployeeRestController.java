package com.hexaware.springrest1.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest1.entity.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	
		  @PostMapping("/insert")
		  public  String    insert(@RequestBody Employee emp) {
			  
			  
			  		return "Employee Added "+emp.toString();
			  
			  
		  }
		
		  
		  
		  
		  @PutMapping("/update")
		  public  String    update(@RequestBody Employee emp) {
			  
			  
			  		return "Employee Update "+emp.toString();
			  
			  
		  }
		
		  
		  @DeleteMapping("/delete/{eid}")
		  public String   delete(@PathVariable  int eid) {
			  
			  
			  return "Record deleted successfully "+eid;
			  
		  }
		  
		  
		  @GetMapping("/getbyid/{eid}")
		  public  String   getById(@PathVariable int eid) {
			  
			  
			  return  "Employee Record found "+eid;
			  
			  
		  }
		  
		  
		  @GetMapping("/getall")
		  public List<Employee>  getAll(){
			  
			  
			  List<Employee>  list = new ArrayList<Employee>();
			  
			  list.add(new Employee(101, "javeed", 90000));
			  list.add(new Employee(102, "king", 80000));
			  list.add(new Employee(103, "tom", 40000));
			  list.add(new Employee(104, "ford", 25000));
			  
			  return list;
			  
		  }
		  
		  
		  
		  
		  
		  
	
	
}
