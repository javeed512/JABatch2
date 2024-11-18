package com.hexaware.springrestjpa.entities;

import java.time.LocalDate;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Product {

	@Id
	// @GeneratedValue(strategy = GenerationType.SEQUENCE )
	// @SequenceGenerator(name = "product_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;

	
	@Size(min = 5, max = 20, message = "productname must be min5 and max20 size")
	private String productName;

	@Min(500)
	@Max(600)
	private double price;

	@Past(message = "purchase date should be past date")
	private LocalDate purchaseDate;
	@Future(message = "delivery date should be future date")
	private LocalDate deliveryDate;

	@Email(message = "email should be in email format")
	private String email;

	@NotEmpty
	@NotBlank
	@Pattern(regexp = "[A-Z][a-z]{7,24}", message = "password start with uppercse , must  be min 8 char and max 25 chars")
	private String password;

	//@CreditCardNumber(message = "credit card should be valid number")
	private long creditCard;

	@AssertTrue
	private boolean isAccountActive;

	public Product() {
		super();
	}

	public Product(int productId,
			@NotNull @Size(min = 5, max = 20, message = "productname must be min5 and max20 size") String productName,
			@Min(500) @Max(600) double price, @Past LocalDate purchaseDate, @Future LocalDate deliveryDate,
			@Email String email,
			@NotEmpty @NotBlank @Pattern(regexp = "[A-Z][a-z]{7,24}", message = "password start with uppercse , must  be min 8 char and max 25 chars") String password,
			@CreditCardNumber long creditCard, @AssertTrue boolean isAccountActive) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.purchaseDate = purchaseDate;
		this.deliveryDate = deliveryDate;
		this.email = email;
		this.password = password;
		this.creditCard = creditCard;
		this.isAccountActive = isAccountActive;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(long creditCard) {
		this.creditCard = creditCard;
	}

	public boolean isAccountActive() {
		return isAccountActive;
	}

	public void setAccountActive(boolean isAccountActive) {
		this.isAccountActive = isAccountActive;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", purchaseDate=" + purchaseDate + ", deliveryDate=" + deliveryDate + ", email=" + email
				+ ", password=" + password + ", creditCard=" + creditCard + ", isAccountActive=" + isAccountActive
				+ "]";
	}

}
