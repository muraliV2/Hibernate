package com.hibernate.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Adharcard 
{ 
	@Id
	private int AadharId;
	private long AadharNumber;
	private String name;
	private String gender;
	private String dob;
	@OneToOne
	private user user;
public user getUser() {
		return user;
	}
	public void setUser(user user) {
		this.user = user;
	}
public int getAadharId() {
		return AadharId;
		
	}
	public void setAadharId(int aadharId) {
		AadharId = aadharId;
	}
	public long getAaadharNumber() {
		return AadharNumber;
	}
	public void setAaadharNumber(long AadharNumber) {
		this.AadharNumber = AadharNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

}
