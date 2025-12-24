package com.jspiders.hibernate.demo;




import java.sql.DriverManager;

import com.jspiders.hibernate.demo.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclas 
{
public static void main(String [] args)
{
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("development");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	Student s1 = new Student();
	s1.setRollno(1);
	s1.setName("ramesh");
	s1.setContact("1234567890");
	s1.setAge(23);
	transaction.begin();
	manager.persist(s1);
	transaction.commit();
	
	
	
	
}
}


//entity manager
