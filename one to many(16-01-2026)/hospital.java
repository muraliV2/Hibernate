package com.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class hospital 
{
	@Id
	private int hospitalId;
    private String hospitalName;
    private String location;
    
    public List<doctors> getList() {
		return list;
	}

	public void setList(List<doctors> list) {
		this.list = list;
	}

	@OneToMany
    private List<doctors> list = new ArrayList<doctors>();

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
