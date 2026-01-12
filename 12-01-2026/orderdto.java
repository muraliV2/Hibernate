package com.hibernate.dto;

import com.hibernate.dao.customer;
import com.hibernate.dao.delivery;
import com.hibernate.dao.order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class orderdto 
{
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();
	public static void insertdata(int orderid,String date,int deliveryid,int customerid)
	{
		
		delivery del = manager.find(delivery.class, deliveryid);
		customer cus = manager.find(customer.class, customerid);
		order od = new order();
		od.setOrderid(orderid);
		od.setDate(date);
		
		
	}
}
