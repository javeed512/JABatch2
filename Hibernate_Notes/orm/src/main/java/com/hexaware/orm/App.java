package com.hexaware.orm;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.orm.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
				System.out.println(session);

		// Before any DML operations INSERT,UPDATE , DELETE transaction should be
		// start/begin

		
		  Transaction tr = session.beginTransaction();
		  // insert or update operations
			
			  Employee emp = new Employee(205, "Adam", 30000);
			  
			  session.saveOrUpdate(emp);
			 
		  
		 // session.persist(emp);
		  
		 // Serializable  ser =	session.save(emp);
		  
		  	//	System.out.println("record affected "+ser.toString());
		  
		  // select by eid 
			/*
			 * Employee e1 = session.get(Employee.class,201);// select by eid
			 * 
			 * System.out.println(e1);
			 * 
			 * 
			 * session.delete(e1); // deleting 201 record from table
			 */
		  tr.commit();
		  
		  
		 

	}
}
