package com.hibernate.dao;

import com.hibernate.dto.Adharcard;
import com.hibernate.dto.user;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UserDao 
{
	  static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	  static EntityManager manager = factory.createEntityManager();
	  static EntityTransaction transaction = manager.getTransaction();
  public static void InsertUser(int UserId,String UserName,String DateOfBirth,String Address,String email,long Contact)
  {
  	user user = new user();
  	user.setUserId(UserId);
  	user.setUserName(UserName);
  	user.setDateOfBirth(DateOfBirth);
  	user.setAddress(Address);
  	user.setEmail(email);
  	user.setContact(Contact);
  	
  	transaction.begin();
  	manager.persist(user);
  	transaction.commit();
  	
  	
    
  }
  public static void finduser(int UserId)
  {
	  user user = manager.find(user.class, UserId);
	  Adharcard card = user.getAdhar();
			  System.out.println();
	  
  }
}
