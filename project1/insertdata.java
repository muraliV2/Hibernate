package com.jspiders.hibernate.dao;
import com.jspiders.hiber.demo1.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductDAO {

    private static EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("development1");

    public static void insertProduct(int productid, String name,
                                     String price, String type) {

        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        product p1 = new product();
        p1.setProductid(productid);
        p1.setName(name);
        p1.setProductprice(price);
        p1.setProducttype(type);

        transaction.begin();
        manager.persist(p1);
        transaction.commit();

        manager.close();
        System.out.println("Product inserted successfully");
    }
}
