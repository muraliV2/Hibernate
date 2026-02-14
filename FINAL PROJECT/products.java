package com.hibernate.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class products 
{
@Id
private int productid;
private String productname;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getCategoryid() {
	return categoryid;
}
public void setCategoryid(String categoryid) {
	this.categoryid = categoryid;
}

private String categoryid;
}

