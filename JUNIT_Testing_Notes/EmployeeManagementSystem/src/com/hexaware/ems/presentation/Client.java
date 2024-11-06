package com.hexaware.ems.presentation;

import java.util.List;
import java.util.Scanner;

import com.hexaware.ems.entity.Employee;
import com.hexaware.ems.exceptions.EmployeeNotFoundException;
import com.hexaware.ems.service.EmployeeServiceImp;
import com.hexaware.ems.service.IEmployeeService;

public class Client {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean flag = true;

		IEmployeeService service = new EmployeeServiceImp();

		while (flag) {

			System.out.println("*****Welcome to EMS*****");
			System.out.println("1.ADD EMPLOYEE");
			System.out.println("2.SHOW ALL EMPLOYEES");
			System.out.println("3.UPDATE EMPLOYEE");
			System.out.println("4. DELETE EMPLOYEE");
			System.out.println("5. SHOW EMPLOYEE BY EID");
			System.out.println("0. EXIT  / LOGOUT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				Employee emp = readEmpData();

				boolean isValid = EmployeeServiceImp.validateEmp(emp);

				if (isValid) {
					int count = service.addEmp(emp);

					if (count > 0) {

						System.out.println("Employee added successfully..");

					}

					else {

						System.err.println("Employee Add Failed...");

					}

				} else {

					System.err.println("Invalid Employee Data");

				}

				break;
			case 2:

				List<Employee> list = service.getAllEmployees();

				for (Employee employee : list) {

					System.out.println(employee);

				}

				break;

			case 3:

				break;

			case 4:

				break;
			case 5:

					System.out.println("Enter Eid to Search Employee");

						int eid =scanner.nextInt();
						
					Employee employee =	service.getByEid(eid);
					
					if(employee != null)	
					System.out.println(employee);
					
				break;
			case 0:
					flag = false;
					
					System.out.println("Thank you , logout successfully..");
				
				
				break;

			default:
					System.err.println("Invalid option");
				
				break;
			}

		}

	}

	public static Employee readEmpData() {

		Employee emp = new Employee();

		System.out.println("Enter Eid");
		emp.setEid(scanner.nextInt());
		System.out.println("Enter Ename");
		emp.setEname(scanner.next());
		System.out.println("Enter Salary");
		emp.setSalary(scanner.nextDouble());

		return emp;

	}

}
