package com.hexaware.springrestjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.entities.Product;
import com.hexaware.springrestjpa.repository.ProductRepository;

@Service
public class ProductServiceImp implements IProductService {
	
	
	@Autowired
	ProductRepository repo;

	@Override
	public Product addProduct(Product product) {
	
		return repo.save(product);
	}

}
