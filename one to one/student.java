package com.hibernate.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student 
{
	@Id
	private int studentid;
	private String age;
	private String gender;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
