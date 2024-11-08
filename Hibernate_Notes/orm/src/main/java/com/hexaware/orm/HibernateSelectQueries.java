package com.hexaware.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.orm.entity.Employee;

public class HibernateSelectQueries {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		// HQL or JPQL
		// select record by ename
		String selectQuery = "select e from  Employee e where  e.ename = ?1 ";

		Query<Employee> query = session.createQuery(selectQuery);

		query.setParameter(1, "Javeed");

		Employee e1 = query.getSingleResult();

		System.out.println(e1.getEname() + " " + e1.getSalary());

		String selectAll = "select e from Employee  e";

		// select all records

		Query query2 = session.createQuery(selectAll, Employee.class);

		List<Employee> list = query2.getResultList();

		list.forEach((emp) -> System.out.println(emp));

		String selectSalaryGT = "select e from Employee e  where e.salary > :amount";
		Query<Employee> query3 = session.createQuery(selectSalaryGT);

		query3.setParameter("amount", 45000.0);

		List<Employee> listEmp = query3.getResultList();

		for (Employee employee : listEmp) {

			System.out.println(employee);

		}

	}

}
