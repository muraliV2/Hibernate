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
  public static void UpdateUser(int userId,
          String userName,
          String dateOfBirth,
          String address,
          String email,
          long contact) {

user existingUser = manager.find(user.class, userId);

if (existingUser != null) {
transaction.begin();

existingUser.setUserName(userName);
existingUser.setDateOfBirth(dateOfBirth);
existingUser.setAddress(address);
existingUser.setEmail(email);
existingUser.setContact(contact);

transaction.commit();
System.out.println("User updated successfully");
} else {
System.out.println("Invalid user id");
}
}

 public static void readdata(int userId)
 {
	 user read = manager.find(user.class, userId);
	 if(read != null)
	 {
		 System.out.println(read.getUserName() + " " + read.getDateOfBirth() + " " +  read.getAddress() + " " + read.getEmail() + " " + read.getContact());
	 }
	 else
	 {
		 System.out.println("check the code there is a error");
	 }
 }
 public static void deletedata(int userId)
 {
	 user del = manager.find(user.class, userId);
	 if(del != null)
	 {
	 
	 transaction.begin();
	 manager.remove(del);
	 transaction.commit();
	 }
	 else
	 {
		 System.out.println("check the query");
	 }
	 
 }
}
