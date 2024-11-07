package com.hexaware.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springdemo.repository.EmployeeRepositoryImp;

@Service
public class EmployeeServiceImp {
	
	
	@Autowired   // injecting or wiring
	private  EmployeeRepositoryImp  repo;
	
	
	@Autowired
	private   Thread thread;
	
	
	public void  displayService() {
		
		System.out.println(thread);
		
		System.out.println("Repo object in service class "+repo);
		
		repo.displayRepo();
		
	}
	

}
