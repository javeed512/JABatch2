package com.hexaware.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.orm.entity.Employee;

public class NamedQueryDemo {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();

	public static void main(String[] args) {

		NamedQueryDemo  demo = new NamedQueryDemo();

			  System.out.println(demo.getAllEmployees());
			  
			  
			  System.out.println(demo.getByEname("Ford"));
		

	}
	
	
	public   List<Employee>   getAllEmployees(){
		
		Query  query =	session.createNamedQuery("getAllEmployees");
		
		
		List<Employee>  list = query.getResultList();
		
		return list;
		
	}
	
	
	
	public   Employee   getByEname(String ename) {
		
		Query<Employee>  query =	session.createNamedQuery("getByEname");
		
				query.setParameter("name", ename);
		
			
		Employee emp =		query.getSingleResult();
		
				return emp;
		
		
	}
	
	
	
	
	
	
	

}
