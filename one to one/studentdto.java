package com.hibernate.dto;

import com.hibernate.dao.idcard;
import com.hibernate.dao.student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

public class studentdto 
{
	static EntityManagerFactory factory  = Persistence.createEntityManagerFactory("development");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();
   public static void insertdata(int Studentid,String age,String gender,int id)
   {
	   student st = new student();
	   st.setStudentid(Studentid);
	   st.setAge(age);
	   st.setGender(gender);
	   idcard ica = manager.find(idcard.class, id);
	   st.setCard(ica);
	   transaction.begin();
	   manager.persist(st);
	   transaction.commit();
	   
   }
   public static void updatedata(int Studentid,String age,String gender,int id)
   {
	   student st = manager.find(student.class, Studentid);
	   idcard ib = manager.find(idcard.class, id);
	   if(st != null)
	   {
		   st.setAge(age);
		   st.setGender(gender);
		   st.setCard(ib);
		   transaction.begin();
		   transaction.commit();

		   
		   
	   }
	   
   }
   public static void readdata(int Studentid)
   {
	   student st = manager.find(student.class, Studentid);
	   
	   if(st != null)
	   {
		   System.out.println(st.getStudentid() + " " + st.getAge() + " " + st.getGender() + " " + st.getCard() );
		   
	   }
	   transaction.begin();
	   
	   
   }
 public static void delete(int studentid)
 {
	 student st = manager.find(student.class, studentid);
	 manager.remove(st);
	 transaction.begin();
	 transaction.commit();
	 
 }
   
}
