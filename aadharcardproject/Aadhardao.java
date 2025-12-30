package com.hibernate.dao;

import com.hibernate.dto.Adharcard;
import com.hibernate.dto.user;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AadharDao 
{
	 static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	  static EntityManager manager = factory.createEntityManager();
	  static EntityTransaction transaction = manager.getTransaction();
 public static void InsertAadhar(int AadharId,long AadharNumber,String name,String gender,String dob,int userId)
 {
 	Adharcard adhar = new Adharcard();
 	adhar.setAadharId(AadharId);
 	adhar.setAaadharNumber(AadharNumber);
 	adhar.setName(name);
 	adhar.setGender(gender);
 	adhar.setDob(dob);
 	
 	user user = manager.find(user.class, userId);
 	if(user != null)
 		user.setAdhar(adhar);
 	transaction.begin();
  	manager.persist(adhar);
  	transaction.commit();
  	
 	

 }
}
