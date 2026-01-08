package com.hibernate.dto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class idcarddto 
{
public static void insertdata(int id,int cardnumber,String issuedate)
{
EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
EntityManager manager = factory.createEntityManager();
EntityTransaction transaction  = manager.getTransaction();

}



}
