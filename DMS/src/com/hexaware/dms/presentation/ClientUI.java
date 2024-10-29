package com.hexaware.dms.presentation;

import com.hexaware.dms.entity.Department;

public class ClientUI {

	public static void main(String[] args) {

		
		Department d1 = new Department(1,"Training","Banglore");
		
			
		
		System.out.println(d1);    // d.toString();
		
		Department d2 = new Department(2,"Development","Chennai");
		
		System.out.println(d2.getDno() +"  "+ d2.getDname() );
		
				d1.setLocation("Hyderabad");
				
				System.out.println(d1);
		
				
				//Department d3 = new Department(0,"Testing",null);	
		
					Department d3 = new Department();
				
					 d3.setDname("Testing");
					 
					 System.out.println(d3);
					 
	}

}
