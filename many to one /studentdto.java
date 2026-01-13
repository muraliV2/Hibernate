package com.hibernate.dto;

import javax.sound.midi.Transmitter;

import com.hibernate.dao.college;
import com.hibernate.dao.student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

public class studentdto {

static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();
public static void insert(int studentId,String studentName,int year,int collegeId)
{
	student st = new student();
	st.setStudentId(studentId);
	st.setStudentName(studentName);
	st.setYear(year);
	college cg = manager.find(college.class, collegeId);
	
		
		st.setClg(cg);
		transaction.begin();
		manager.persist(st);
		transaction.commit();
	
}

}
