package com.hexaware.hibernate.mapping;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hexaware.hibernate.mapping.entity.Address;
import com.hexaware.hibernate.mapping.entity.Student;

public class OneToOneMappingDemo {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		// Uni directional one to one student inject address
		
		  Address addr = new Address(10,"Hyderabad");
		  
		  Student student = new Student(101, "King", addr);
		 

		// bi directional address injects student

		/*
		 * Student student = new Student(104, "scott");
		 * 
		 * Address address = new Address();
		 * 
		 * address.setAddressId(40); address.setCity("Banglore");
		 * address.setStudent(student);
		 */

		Transaction tr = session.beginTransaction();

		session.persist(student);
		
		//session.persist(address);// insert student obj

		tr.commit();

	}

}
