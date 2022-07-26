package com.ecommerce.sportyshoes.model;

import java.sql.Date;

public class Purchase {

	private String id;
	private String user;
	private String productName;
	private String productCategory;
	private Date timestamp;
	
	@Override
	public String toString() {
		return "Purchase [timestamp=" + timestamp + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
