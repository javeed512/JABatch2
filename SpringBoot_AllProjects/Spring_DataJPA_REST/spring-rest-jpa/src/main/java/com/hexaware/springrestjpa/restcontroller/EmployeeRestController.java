package com.hexaware.springrestjpa.restcontroller;

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

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;

	@PostMapping(value="/add",consumes = "application/json",produces = "application/json")
	public Employee insertEmployee(@RequestBody Employee emp) {

		return service.addEmployee(emp);

	}
	
	@PutMapping("/update")
	public Employee  updateEmployee(@RequestBody Employee emp) {

		return service.updateEmployee(emp);

	}

	
	@GetMapping("/getbyid/{eid}") 
	public Employee   getEmployeeById(@PathVariable long eid) {
		
		return  service.getEmployeeById(eid);
		
	}
	
	@GetMapping(value="/getall",produces = "application/json")
	public List<Employee>  getAll(){
		
		
		return service.getAllEmployees();
		
	}
	
	
	@DeleteMapping("/deletebyid/{eid}") 
	public String  deleteById(@PathVariable long eid) {
		
		return  service.deleteEmployeeById(eid);
		
	}
	
	@GetMapping("/getbyename/{ename}")
	public List<Employee>  getByEname(@PathVariable String ename){
		
		
		return service.getByEname(ename);
		
	}
	
	@GetMapping("/getbysalarygt/{salary}")
	public List<Employee>  getBySalaryGT(@PathVariable double salary){
		
		
		return service.getBySalaryGT(salary);
		
	}
	
	
	@GetMapping("/getbysalarysorted")
	public List<Employee>  getBySalarySorted(){
		
		
		return service.getBySalarySorted();
		
	}
	
	@GetMapping("/getsalarybyrange/{min}/{max}")
	public List<Employee>  getBySalaryRange(@PathVariable double min , @PathVariable double max){
		
		
		return service.getBySalaryRange(min, max);
		
	}
	
	@DeleteMapping("/deletebyename/{ename}")
	public String  deleteByEname(@PathVariable String ename) {
		
		
	  int count =	service.deleteByEname(ename);
	  
	 return  count + " record deleted";
		
	}
	
	
	
	  @PutMapping("/updatesalary") public int updateSalary(@RequestBody Employee
	  emp) {
	  
	  return service.updateSalary(emp.getSalary(),emp.getEid()); 
	  
	  }
	 
	
	@PutMapping("/updatesalary/{sal}/{id}")
	public int updateSalary(@PathVariable  double sal,  @PathVariable  long id) {
		
		return   service.updateSalary(sal, id);
	}
	
	
	

}
