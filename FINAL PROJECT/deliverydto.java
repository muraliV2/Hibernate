package com.hibernate.dto;

import com.hibernate.dao.Delivery;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class deliverydto 
{
static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction  transaction = manager.getTransaction();

public static void insetdata(int deliveryid,String type,String status)
{
transaction.begin();
Delivery del = new Delivery();
del.setDeliveryid(deliveryid);
del.setType(type);
del.setStatus(status);




manager.persist(del);
transaction.commit();
}
}
