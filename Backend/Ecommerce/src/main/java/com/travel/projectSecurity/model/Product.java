package com.travel.projectSecurity.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "product_id")
	private Long productId;
	
	@JoinColumn(name = "productCode")
	private String productCode;
	
	@JoinColumn(name = "productName")
	private String productName;
	
	@JoinColumn(name = "categories")
	private String categories;
	
	@JoinColumn(name = "productType")
	private String productType;
	
	@JoinColumn(name = "insertDate")
	private Date insertDate;
	
	@JoinColumn(name = "quantity")
	private int quantity;
	
	@JoinColumn(name = "price")
	private double price;

	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long productId, String productCode, String productName, String categories, String productType,
			Date insertDate, int quantity, double price) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.categories = categories;
		this.productType = productType;
		this.insertDate = insertDate;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCode=" + productCode + ", productName=" + productName
				+ ", categories=" + categories + ", productType=" + productType + ", insertDate=" + insertDate
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}

	
	
	
}
