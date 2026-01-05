package com.qsp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity(name = "EMP")
public class employee 
{
	@Id
	@Column(name = "empno")
private int empid;
	@Column(name = "eName")
private String name;
	@Column(name = "job")
private String designation;
	@Column(name = "hiredate")
private String hiredate;
	@Column(name = "SAL")
private int salary;
	@Column(name = "mgr")
private int managerID;
	@Column(name = "comm")
private int commision;
	public int getEmpid() {
		return empid;
		
	}
@ManyToOne
private department department;

	public department getDepartment() {
	return department;
}
public void setDepartment(department department) {
	this.department = department;
}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getManagerID() {
		return managerID;
	}
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}
	public int getCommision() {
		return commision;
	}
	public void setCommision(int commision) {
		this.commision = commision;
	}

}
