package com.hinernate.dto;

import com.hibernate.dto.capital;
import com.hibernate.dto.state;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

public class capitalDao 
{
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();
	public static void insertdate(int CapitalId,String CapitalName,int Population)
	{
		capital ct = new capital();
		ct.setCapitalId(CapitalId);
		ct.setCapitalName(CapitalName);
		ct.setPopulation(Population);
		transaction.begin();
		manager.persist(ct);
		transaction.commit();
		}
	public static void updatedata(int CapitalId,String CapitalName,int Population)
	{
		capital cap = manager.find(capital.class, CapitalId);
		if(cap != null)
		{
			transaction.begin();
			cap.setCapitalName(CapitalName);
			cap.setPopulation(Population);
			transaction.commit();
			
		}
		
	}
	public static void readdata(int CapitalId)
	{
		capital cp = manager.find(capital.class, CapitalId);
		if(cp != null)
		{
			System.out.println(cp.getCapitalId() + " " + cp.getCapitalName() + " " + cp.getPopulation());
		}
		else
		{
			System.out.println("check the code for errors");
		}
	}
		
		public static void deletedata(int CapitalId)
		{
			capital ct = manager.find(capital.class, CapitalId);
			transaction.begin();
			manager.remove(ct);
			transaction.commit();
		}
		
	
}
