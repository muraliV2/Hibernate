package com.ontomany.dao;

import java.util.List;

import com.ontomany.dto.company;
import com.ontomany.dto.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class productdao 
{
static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();
public static void insertdata(int ProductId,String name,String type,int price,int Quantity,int CompanyId)
{
	product products = new product();
	products.setProductId(ProductId);
	products.setName(name);
	products.setType(type);
	products.setQuantity(Quantity);
	
	company comp =manager.find(company.class,  CompanyId);
	if(comp != null)
	{
		
		List<product> product = comp.getProducts();
		product.add(products);
	}
	else
	{
		System.out.println("invalid code");
	}
	transaction.begin();
	manager.persist(comp);
	manager.persist(products);
	transaction.commit();
	
}
public static void delete(int ProductId)
{
product product = manager.find(product.class, ProductId);
transaction.begin();
manager.remove(product);
transaction.commit();
}

}
