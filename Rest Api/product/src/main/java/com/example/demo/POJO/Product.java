package com.example.demo.POJO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	@Id
	private int proId;
	@Column(length = 22)
	private String proName;
	@Column(length = 22)
	private String productCatagory;
	private float porductPrice;
	public Product() {
		super();
	}
	public Product(int proId, String proName, String productCatagory, float porductPrice) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.productCatagory = productCatagory;
		this.porductPrice = porductPrice;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProductCatagory() {
		return productCatagory;
	}
	public void setProductCatagory(String productCatagory) {
		this.productCatagory = productCatagory;
	}
	public float getPorductPrice() {
		return porductPrice;
	}
	public void setPorductPrice(float porductPrice) {
		this.porductPrice = porductPrice;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", productCatagory=" + productCatagory
				+ ", porductPrice=" + porductPrice + "]";
	}
	
}
