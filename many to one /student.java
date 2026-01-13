 package com.hibernate.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class student 
{
	@Id
	    private int studentId;
	    private String studentName;
	    private int year;
	    @ManyToOne
	    private college clg;
	    public college getClg() {
			return clg;
		}
		public void setClg(college clg) {
			this.clg = clg;
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
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		
}
