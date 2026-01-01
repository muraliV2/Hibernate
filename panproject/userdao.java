package com.hibernate.dao;

import com.hibernate.dto.pancard;
import com.hibernate.dto.user1;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UserDao {

    static EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("development");
    static EntityManager manager = factory.createEntityManager();
    static EntityTransaction transaction = manager.getTransaction();

    public static void insertdata(int userId, String name, String email,
                                  long mobileNum, String dob, int panId) {

        user1 user = new user1();
        user.setUserId(userId);
        user.setName(name);
        user.setEmail(email);
        user.setMobileNum(mobileNum);
        user.setDob(dob);

     
        pancard pan = manager.find(pancard.class, panId);
        user.setPancard(pan);

        transaction.begin();
        manager.persist(user);
        transaction.commit();
    }
public static void updatedata(int userId, String name, String email,
                                  long mobileNum, String dob, int panId)
{
	
user1 existingdata = manager.find(user1.class, userId);
if(existingdata != null)
{
existingdata.setName(name);
existingdata.setEmail(email);
existingdata.setMobileNum(mobileNum);
existingdata.setDob(dob);
}
else
{
	System.out.println("check the code for erroes");
	}
}
}
