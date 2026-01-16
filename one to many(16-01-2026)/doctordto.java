package com.hibernate.dto;

import java.util.List;

import com.hibernate.dao.doctors;
import com.hibernate.dao.hospital;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class doctordto 
{
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();
	
public static void insertdata(int doctorId,String doctorName,int age,String gender,int hospitalId)
{
   doctors dt = new doctors();
   dt.setDoctorId(doctorId);
   dt.setDoctorName(doctorName);
   dt.setAge(age);
   dt.setGender(gender);
   hospital hos = manager.find(hospital.class, hospitalId);
   if(hos != null)
   {
	    List<doctors> hi = hos.getList();
	    hi.add(dt);
	   
   }
   
   transaction.begin();
   manager.persist(dt);
   
   transaction.commit();
   
}
}
