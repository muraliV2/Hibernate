package com.jspiders.hiber.demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class product 
{
	@Id
private int productid;
private String name;
private String productprice;
private String producttype;
public product() {
	
}

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

public String getProductprice() {
	return productprice;
}

public void setProductprice(String productprice) {
	this.productprice = productprice;
}

public String getProducttype() {
	return producttype;
}

public void setProducttype(String produScttype) {
	this.producttype = produScttype;
}
}
