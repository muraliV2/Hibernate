package com.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class library 
{
	@Id
	private int libraryId;
	private String libraryName;
	private String location;
	
	@OneToMany
	private List<books> book = new ArrayList<books>();

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<books> getBook() {
		return book;
	}

	public void setBook(List<books> book) {
		this.book = book;
	}
}
