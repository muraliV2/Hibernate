package com.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class course 
{
@Id
private int courseId;
private String courseName;
private String courseduration;

@ManyToMany 
private List<student> student = new ArrayList<student>();

public List<student> getStudent() {
	return student;
}
public void setStudent(List<student> student) {
	this.student = student;
}
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCourseduration() {
	return courseduration;
}
public void setCourseduration(String courseduration) {
	this.courseduration = courseduration;
}
}
