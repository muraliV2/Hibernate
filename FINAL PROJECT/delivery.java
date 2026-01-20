package com.hibernate.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Delivery 
{
@Id

private int Deliveryid;
private String type;
private String status;
public int getDeliveryid() {
	return Deliveryid;
}
public void setDeliveryid(int deliveryid) {
	Deliveryid = deliveryid;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
