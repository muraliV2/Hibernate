package com.hibernate.dao;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class customer 
{
	@Id
private int customerid;
private String name;
private String Email;
private String Address;
private List<order> orders = new ArrayList<order>();
@OneToMany
public int getCustomerid() {
return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
}
