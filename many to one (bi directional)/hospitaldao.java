package com.hibernate.dao;

import java.util.List;

import com.hibernata.dto.doctor;
import com.hibernata.dto.hospital;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class hospitaldao 
{
static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();

public static void insertdata(int hospitalId,String hospitalName,String location)
{
	hospital hd = new hospital();
	hd.setHospitalId(hospitalId);
	hd.setHospitalName(hospitalName);
	hd.setLocation(location);
	transaction.begin();
	manager.persist(hd);
	transaction.commit() ;
}

public static void read(int hospitalId)
{

hospital hh = manager.find(hospital.class, hospitalId);
List<doctor> list = hh.getList();
for(doctor hg : list)
{
System.out.println(hg.getDoctorId() + " " + hg.getDoctorName() + " " + hg.getAge() + " " + hg.getGender() + " " + hg.getHospital());
}


}
}
