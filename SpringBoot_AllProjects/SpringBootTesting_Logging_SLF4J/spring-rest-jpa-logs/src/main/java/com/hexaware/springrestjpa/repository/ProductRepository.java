package com.hexaware.springrestjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestjpa.entities.Product;

@Repository
public interface ProductRepository  extends  JpaRepository<Product, Integer> {

}
