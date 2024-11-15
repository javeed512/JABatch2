package com.hexaware.springrest.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springrest.datajpa.entity.Employee;

@Repository
public interface EmployeeRepository   extends  JpaRepository<Employee, Long>{

}
