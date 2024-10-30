package com.hexaware.bank.presentation;

import com.hexaware.bank.service.BankImpOne;
import com.hexaware.bank.service.BankImpTwo;
import com.hexaware.bank.service.IBank;

public class TestStaticDefault {

	public static void main(String[] args) {


			IBank.createAccount();
			
		Object  o =	new BankImpTwo(); // Runtime polymorphism
			
			BankImpTwo b =  (BankImpTwo)  o;
		
		
		
			b.login();
			
			
		String s =  b.toString();
		
		//Integer n = 5;
		
		int n =5;
		
				String s1	=  n +"";
			
			
			
		
	}

}
