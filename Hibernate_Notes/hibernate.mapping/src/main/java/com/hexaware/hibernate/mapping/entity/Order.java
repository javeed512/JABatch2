package com.hexaware.hibernate.mapping.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_master")
public class Order {
	
	@Id
	private int  orderId;
	private LocalDate purchaseDate;
	
	@ManyToMany(cascade = CascadeType.ALL)
	
	@JoinTable(name="products_orders_table", 
			joinColumns = {@JoinColumn(name="order_id")} ,
			inverseJoinColumns = {@JoinColumn(name="product_id")}
				)
	private  Set<Product>  products = new HashSet<Product>();
	
	public Order() {
		
		
	}
	
	
	
	public Order(int orderId, LocalDate purchaseDate, Set<Product> products) {
		super();
		this.orderId = orderId;
		this.purchaseDate = purchaseDate;
		this.products = products;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}


	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	public Set<Product> getProducts() {
		return products;
	}


	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public void addProduct(Product p) {
		
		
		this.getProducts().add(p);
	
	
}
	
	
	

}
