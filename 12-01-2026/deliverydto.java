package com.hibernate.dto;

import com.hibernate.dao.delivery;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class deliverydto 
{
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();
	public static void insertdata(int deliverid,String type,String status)
	{
		delivery del = new delivery();
		del.setDeliverid(deliverid);
		del.setType(type);
		del.setStatus(status);
		transaction.begin();
		manager.persist(del);
		transaction.commit();
	}
}
