package com.hibernate.dto;

import com.hibernate.dao.customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class customerdto 
{
static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();

public static void insertdata(int customerid,String name,String email,String address)
{
customer cust = new customer();
cust.setCustomerid(customerid);
cust.setName(name);
cust.setEmail(email);
cust.setAddress(address);
transaction.begin();
manager.persist(cust);
transaction.commit();
}
}
