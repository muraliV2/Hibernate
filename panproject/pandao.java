package com.hibernate.dao;

import com.hibernate.dto.pancard;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PanDao {

    static EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("development");
    static EntityManager manager = factory.createEntityManager();
    static EntityTransaction transaction = manager.getTransaction();

    public static void insertdata(int panId, long panNo,
                                  String panName, String gender, String dob) {

        pancard pan = new pancard();
        pan.setPanId(panId);
        pan.setPanNo(panNo);
        pan.setPanName(panName);
        pan.setGender(gender);
        pan.setDob(dob);

        transaction.begin();
        manager.persist(pan);
        transaction.commit();
    }
    public static void updatedata(int panId, long panNo,
                                  String panName, String gender, String dob)
    {
    	pancard existdata = manager.find(pancard.class, panId);
    	if(existdata != null)
    	{
    	existdata.setPanNo(panNo);
    	existdata.setPanName(panName);
    	existdata.setGender(gender);
    	existdata.setDob(dob);
    	}
    	else
    	{
    		System.out.println("check the error");
    	}
    	
    }
    public static void readdata(int PanId)
    {
    	pancard read = manager.find(pancard.class, PanId);
    	if(read != null)
    	{
    		System.out.println(read.getPanId() + " " + read.getPanNo() + " " + read.getPanName() + " " + read.getGender() + " " + read.getDob());
    		
    	}
    	else
    	{
    		System.out.println("check the code for any errors");
    	}
    	
    }
    
    public static void deletedata(int PanId)
    {
    	pancard card = manager.find(pancard.class, PanId);
    	transaction.begin();
        manager.remove(card);
        transaction.commit();
    	
    }
}
