package com.hexaware.bank.service;

/*
 * @Author: Javeed  TL
 * @Description: IBank is an interface
 * Date:  9th Oct 2024
 */
public interface IBank {  // public purpose
	
	public static final  String IFSC = "HEXA1234";
	
		public abstract  void  deposit();
		
		  void withdraw();
		  
		
		  public static  void createAccount() {
			  
			  System.out.println("New Account created..");
			  
		  }
		  
		  public default  void login() {
			  
			  
			  System.out.println("Login success..");
			  
		  }
		  
	

}
