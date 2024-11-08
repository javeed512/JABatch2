package com.hexaware.hibernate.mapping;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.mapping.entity.Order;
import com.hexaware.hibernate.mapping.entity.Product;

public class ManyToManyDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		

		Transaction txn =		session.beginTransaction();
		
		Product p1 = new Product();
		p1.setProductId(54);
		p1.setProductName("Electronics");

		Product p2 = new Product();
		p2.setProductId(55);
		p2.setProductName("Grocery");

		Product p3 = new Product();
		p3.setProductId(56);
		p3.setProductName("Snacks");

		Order order1 = new Order();
		order1.setOrderId(201);
		order1.setPurchaseDate(LocalDate.now());
		
			order1.addProduct(p1);  order1.addProduct(p3);
		
		
		
		Order order2 = new Order();
		order2.setOrderId(301);
		order2.setPurchaseDate(LocalDate.now());

		order2.addProduct(p1); order2.addProduct(p2);  order2.addProduct(p3);
		
			session.persist(order1);
			session.persist(order2);
			
			txn.commit();
			
			session.close();
	}

}
