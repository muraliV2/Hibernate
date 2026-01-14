package com.hibernate.dto;

import java.util.List;

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
	
		
		
		transaction.begin();
		manager.persist(st);
		transaction.commit();
	
}
public static void printCollegeByStudent(int studentId)
{
    student st = manager.find(student.class, studentId);

    if (st == null) {
        System.out.println("Student not found");
        return;
    }

    college c = st.getClg();

    if (c == null) {
        System.out.println("College not assigned");
        return;
    }
    System.out.println(st.getStudentName());
    System.out.println(c.getCollegeName());
    System.out.println(c.getLocation());
    System.out.println(c.getCity());
}


}
