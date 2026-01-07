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
 public static void updatedata(int AadharId,long AadharNumber,String name,String gender,String dob,int userId)
 {
	 Adharcard existingdata = manager.find(Adharcard.class, AadharId);
	 if(existingdata != null)
	 {
		 
		 transaction.begin();
		 existingdata.setAaadharNumber(AadharNumber);
		 existingdata.setName(name);
		 existingdata.setGender(gender);
		 existingdata.setDob(dob);
		 existingdata.setAadharId(AadharId);
	 }
	 
 }
 public static void read(int AadharId)
 {
	 Adharcard read = manager.find(Adharcard.class, AadharId);
	 if(read != null)
	 {
		 System.out.println(read.getAaadharNumber() + " " + read.getName() + " " + read.getGender() + " " + read.getDob() + " " + read.getAadharId());
	 }
 }
 public static void deletedata(int AadharId)
 {
	 Adharcard del = manager.find(Adharcard.class, AadharId);
	 if(del != null)
	 {
		 transaction.begin();
		 manager.remove(del);
		 transaction.commit();
	 }
	 else
	 {
		 System.out.println("check the querry");
	 }
	 
 }
 public static void finddata(int AadharId)
 {
	 Adharcard card = manager.find(Adharcard.class, AadharId);
	 user user = card.getUser();
	 System.out.println(user.getUserId() + "  " + user.getUserName() + "  " + user.getAddress() + "  " + user.getDateOfBirth());
	 
 }
}
