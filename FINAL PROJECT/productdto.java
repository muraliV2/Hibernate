package com.hibernate.dto;

import com.hibernate.dao.products;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class productdto 
{
static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction =  manager.getTransaction();

public static void insertdata(int productid,String productname,String categoryid)
{
	transaction.begin();
	products prod = new products();
	prod.setProductid(productid);
	prod.setProductname(productname);
	prod.setCategoryid(categoryid);
	manager.persist(prod);
	transaction.commit();
	
	
			
}
}
