package com.hibernate.dto;

import com.hibernate.dao.college;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class collegedto 
{
static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();
public static void insert(int collegeId,String collegename,String Location,String city)
{
	college clg = new college();
	clg.setCollegeId(collegeId);
	clg.setCollegeName(collegename);
	clg.setLocation(Location);
	clg.setCity(city);
	transaction.begin();
	manager.persist(clg);
	transaction.commit();
}
}
