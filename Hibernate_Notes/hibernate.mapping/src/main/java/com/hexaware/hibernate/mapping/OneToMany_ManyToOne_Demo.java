package com.hexaware.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.mapping.entity.Department;
import com.hexaware.hibernate.mapping.entity.Employee;

public class OneToMany_ManyToOne_Demo {

	public static void main(String[] args) {

		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction txn = session.beginTransaction();

		Employee e1 = new Employee(101, "King", 55000);
		Employee e2 = new Employee(102, "Smith", 30000);
		Employee e3 = new Employee(103, "Ford", 40000);
		Employee e4 = new Employee(104, "Ravi", 25000);

		Department dept1 = new Department();
		dept1.setDepartmentId(10);
		dept1.setDepartmentName("Development");

		dept1.addEmployee(e1);
		dept1.addEmployee(e2);
		dept1.addEmployee(e3);
		dept1.addEmployee(e4);

		session.persist(dept1);

		txn.commit();


	}

}
