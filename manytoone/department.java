package com.qsp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "DEPT")
public class department 
{
	@Id
	@Column(name = "deptno")
	private  int DepartmentID;
	@Column(name = "Dname")
	private String name;
	@Column(name = "LOC")
	private String Location;
	
public int getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID(int departmentID) {
		DepartmentID = departmentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}

}
