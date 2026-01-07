package com.hibernate.mappingdemo;

import com.hibernate.dao.AadharDao;
import com.hibernate.dao.UserDao;
import com.hibernate.dto.user;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 */
public class App {
	

    public static void main(String [] args)
    {
//    	AadharDao.InsertAadhar(2, 2030, "rono", "male", "31-jul-2000", 1);
//  UserDao.InsertUser(2, "ronalod", "31-jul-2000","portugal hotel", "ronalodpepe@gmail.com", 7070, 2);
    	
    	AadharDao.finddata(2);
  
    }
}
