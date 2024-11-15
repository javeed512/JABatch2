package com.hexaware.springrestjpa.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.entities.Product;
import com.hexaware.springrestjpa.service.IProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
			@Autowired
			IProductService service;
	
		@PostMapping("/add")
		public  Product    addProduct(@Valid  @RequestBody Product product) {
			
			System.out.println(product);
			
				return   service.addProduct(product);
			
		}
	

}
