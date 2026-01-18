package com.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class student 
{
@Id
private int studentId;
private String studentName;
private String age;
private String gender;


 @ManyToMany(mappedBy = "student")
private List<course> course = new ArrayList<course>();


public List<course> getCourse() {
	return course;
}
public void setCourse(List<course> course) {
	this.course = course;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
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
