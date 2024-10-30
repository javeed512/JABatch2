package com.hexaware.bank.service;

//@Author: Javeed TL
public class BankUtil {
	
	
	public static  IBank   getBankObj() {
		
		return  new BankImpTwo();
		
	}
	

}
