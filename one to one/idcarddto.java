package com.hibernate.dto;

import com.hibernate.dao.idcard;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class idcarddto 
{
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction  = manager.getTransaction();

public static void insertdata(int id,int cardnumber,String issuedate)
{
idcard ic = new idcard();
ic.setId(id);
ic.setCardnumber(cardnumber);
ic.setIssuedate(issuedate);
transaction.begin();
manager.persist(ic);
transaction.commit();
}
public static void updatedata(int id,int cardnumber,String issuedate)
{
idcard existdata = manager.find(idcard.class,id);	
if(existdata != null)
{
existdata.setCardnumber(cardnumber);
existdata.setIssuedate(issuedate);
transaction.begin();
manager.persist(existdata);
transaction.commit();
}
}
public static void readdata(int id)
{
idcard ic = manager.find(idcard.class, id);
if(ic != null)
{
System.out.println(ic.getId() + " " + ic.getCardnumber() + " " + ic.getIssuedate());	
}
transaction.begin();
transaction.commit();
}
public static void delete(int id)
{
	idcard ic = manager.find(idcard.class, id);
manager.remove(ic);	
transaction.begin();
transaction.commit();
}



}
