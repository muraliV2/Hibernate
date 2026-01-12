package com.hibernate.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class product 
{
	@Id
private int productid;
private String name;
private int categoryid;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCategoryid() {
	return categoryid;
}
public void setCategoryid(int categoryid) {
	this.categoryid = categoryid;
}
}
