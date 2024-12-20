package com.hexaware.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hexaware.springdemo.service.EmployeeServiceImp;

/**
 *Spring Demo
 *
 */

@Configuration
@ComponentScan("com.hexaware.springdemo")
public class App {
	
	
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		System.out.println(context);

		Employee e1 = (Employee) context.getBean("emp1");

		System.out.println(e1);

		Employee e2 = context.getBean(Employee.class);
		System.out.println(e2);
		
		
			EmployeeServiceImp  service =	  context.getBean(EmployeeServiceImp.class);
		
			System.out.println("service object in main() "+ service);
		
		
			service.displayService();
			
	}
	
	
	
	@Bean
	public   Thread   getThread() {
		
		
		return new Thread();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
