package com.hexaware.bank.service;

/*
 * @Author: Shivam
 * Description: deposit() logic implemented
 * Date: 10th Oct 24
 */


public abstract  class BankImpOne  implements IBank{

	@Override
	public void deposit() {
		
		System.out.println("Deposit Successful...");
		
	}
	
	public abstract void withdraw();

	
}
