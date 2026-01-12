package com.hibernate.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class delivery 
{
	@Id
private int deliverid;
private String type;
private String status;

public int getDeliverid() {
	return deliverid;
}
public void setDeliverid(int deliverid) {
	this.deliverid = deliverid;
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
