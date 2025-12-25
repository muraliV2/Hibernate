package com.jspiders.hiber.demo1;




import java.sql.DriverManager;

import com.jspiders.hiber.demo1.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclas 
{
public static void main(String [] args)
{
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("development1");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	product s1 = new product();
	s1.setProductid(1);
	s1.setName("ramesh");
	s1.setProductprice("1234567890");
	s1.setProducttype("ssd");
	transaction.begin();
	manager.persist(s1);
	transaction.commit();
	
	
	
	
}
}


//entity manager
