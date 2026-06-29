package com.hibernate.mappingdemo;
import com.hibernate.dao.AadharDao;
import com.hibernate.dao.UserDao;
import com.hibernate.dto.user;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
public class App {	
    public static void main(String [] args)
    { 	
    	AadharDao.finddata(2);
  
    }
}
