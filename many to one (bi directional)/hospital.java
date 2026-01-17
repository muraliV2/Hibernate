package com.hibernata.dto;

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
    @OneToMany
   private  List<doctor> list = new ArrayList<doctor>();
	    
	
		public List<doctor> getList() {
		return list;
	}
	public void setList(List<doctor> list) {
		this.list = list;
	}
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
