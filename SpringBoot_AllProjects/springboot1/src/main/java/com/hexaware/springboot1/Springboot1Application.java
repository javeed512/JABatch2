package com.hexaware.springboot1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.hexaware.springboot1.entity.Employee;

@SpringBootApplication  //@Configuration + @ComponentScan("com.hexaware.springboot1.*")
public class Springboot1Application {

	public static void main(String[] args) {
	ApplicationContext  context = 	SpringApplication.run(Springboot1Application.class, args);
	
	
			Employee emp =	context.getBean(Employee.class);
			
				emp.setEid(111);
				emp.setEname("javeed");
				emp.setSalary(5000);
				
				System.out.println(emp);
	
	}
	
		@Bean
		public  Object  get() {
			
			return new Object();
			
		}
	
	

}
