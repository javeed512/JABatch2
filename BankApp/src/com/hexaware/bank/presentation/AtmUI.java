package com.hexaware.bank.presentation;

import java.util.Scanner;

import com.hexaware.bank.service.BankUtil;
import com.hexaware.bank.service.IBank;

/*
 * @Author:Laxman
 * Desp:  UI Designing
 * Date: 11th Oct 24
 * 
 * 
 */
public class AtmUI {

	public static void main(String[] args) {

		boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		
			IBank bank =	BankUtil.getBankObj(); // abstraction
				

		while (flag) {

			System.out.println("*****Welcome to Hexaware ATM*****");
			System.out.println("1. Deposit Cash");
			System.out.println("2. Withdraw Cash");
			System.out.println("3. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				// deposit

				bank.deposit();

				break;
			case 2:
				// withdraw

				bank.withdraw();
				break;
			case 3:

				flag = false;

				System.out.println("Thank You ! Visit Again...");

				break;

			default:

				System.err.println("Invalid Option");

				break;
			}

		}

	}

}
