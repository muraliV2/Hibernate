package com.hibernate.dto;

import java.util.List;

import com.hibernate.dao.course;
import com.hibernate.dao.student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class studentdto 
{
static EntityManagerFactory factory  = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();
public static void insert(int studentId,String studentName,String age,String gender)
{
student s = new student();
s.setStudentId(studentId);
s.setStudentName(studentName);
s.setAge(age);
s.setGender(gender);



transaction.begin();
manager.persist(s);
transaction.commit();
}
public static void readStudent(int courseId)
{
course c = manager.find(course.class, courseId);
List<student> st = c.getStudent();


for(student s : st)
{
System.out.println(s.getStudentId() + " " + s.getStudentName() + " " + s.getAge() + " " + s.getGender() );	
}
}
}
