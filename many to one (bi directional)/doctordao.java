package com.hibernate.dao;

import java.util.List;

import com.hibernata.dto.doctor;
import com.hibernata.dto.hospital;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class doctordao 


{
static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();

public static void insertdata(int doctorId,String doctorName,int age,String gender,int hospitalId)
{
 doctor gr = new doctor();
 hospital hs = manager.find(hospital.class, hospitalId);
 gr.setDoctorId(doctorId);
 gr.setDoctorName(doctorName);
 gr.setAge(age);
 gr.setGender(gender);
 gr.setHospital(hs);
 hs.getList().add(gr);
 transaction.begin();
 manager.persist(gr);
 transaction.commit();
}
}
