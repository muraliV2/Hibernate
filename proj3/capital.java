package com.hibernate.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class capital 
{
	@Id
	private int CapitalId;
	private String CapitalName;
	private int Population;
	public int getCapitalId() {
		return CapitalId;
	}
	public void setCapitalId(int capitalId) {
		CapitalId = capitalId;
	}
	public String getCapitalName() {
		return CapitalName;
	}
	public void setCapitalName(String capitalName) {
		CapitalName = capitalName;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	
}
