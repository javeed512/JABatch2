package com.hexaware.mock;

public class CalcService {
	
	private AddService addService;

	public CalcService(AddService addService) {
		super();
		this.addService = addService;
	}
	
	
	public int calc(int a, int b) {
		
		
		System.out.println("CalcService calc()  executed");
		
		
		return  addService.add(a, b);
	}
	
	public  int  sub(int a , int b) {
		
		return 0;
		
	}
	

}
