package com.ontomany.dao;

import java.util.List;

import com.jspiders.hibernate_demo.dto.Product;
import com.ontomany.dto.company;
import com.ontomany.dto.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class companydao 
{
static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();
public static void insertCompanyData(int companyId, String companyName, String email, String contact)
{
	company comp = new company();
	comp.setCompanyId(companyId);
	comp.setCompanyName(companyName);
	comp.setEmail(email);
	comp.setContact(contact);
	transaction.begin();
	manager.persist(comp);
	transaction.commit();
}
public static void readdata(int companyId)
{
company company = manager.find(company.class, companyId);
List<product> product = company.getProducts();
for(product prod : product)
{
	System.out.println(prod.getName() + " " + prod.getQuantity() + " " + prod.getName() + " " + prod.getPrice() + " " + prod.getType() );
}

}
}
