package com.hibernate.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class user 
{
	@Id
private int UserId;
private String UserName;
private String DateOfBirth;
private String address;
@OneToOne
Adharcard adhar;
public Adharcard getAdhar() {
	return adhar;
}
public void setAdhar(Adharcard adhar) {
	this.adhar = adhar;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
private String Email;
private long Contact;
public int getUserId() {
	return UserId;
}
public void setUserId(int userId) {
	UserId = userId;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public long getContact() {
	return Contact;
}
public void setContact(long contact) {
	Contact = contact;
}

}
