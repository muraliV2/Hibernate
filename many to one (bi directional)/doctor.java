package com.hibernata.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class doctor 
{
	@Id
	private int doctorId;
    private String doctorName;
    private int age;
    private String gender;
    @ManyToOne @JoinColumn(name = "hospital_id")
    
    private hospital hospital;
	public hospital getHospital() {
		return hospital;
	}
	public void setHospital(hospital hospital) {
		this.hospital = hospital;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
