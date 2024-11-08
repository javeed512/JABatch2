package com.hexaware.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.hexaware.orm.entity.Employee;

public class NativeQueryDemo {
	
	static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	static Session session = sessionFactory.openSession();


	public static void main(String[] args) {

		
			String selectQuery ="select * from emp_table";

		NativeQuery<Employee>  nativeQuery =	session.createNativeQuery(selectQuery,Employee.class);
		
		List<Employee>  list =		nativeQuery.getResultList();
		
		System.out.println(list);
		
	}

}
