package com.hibernate.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class order 
{
@Id
private int orderid;
private String orderdate;
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public String getOrderdate() {
	return orderdate;
}
public void setOrderdate(String orderdate) {
	this.orderdate = orderdate;
}
}
