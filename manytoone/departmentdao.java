package com.qsp.dao;

import com.qsp.dto.department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class departmentdao 
{
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();
public static void insertdata(int DepartmentID,String name,String location)
{
	department dept = new department();
	
	dept.setDepartmentID(DepartmentID);
	dept.setName(name);
	dept.setLocation(location);
	transaction.begin();
	manager.persist(dept);
	transaction.commit();
}
public static void deletedata(int DepartmentID)
{
	department dp = manager.find(department.class, DepartmentID);
	
		transaction.begin();
		manager.remove(dp);
		transaction.commit();
		
	
	}
}
