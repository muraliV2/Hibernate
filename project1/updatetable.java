package com.jspiders.hibernate_demo.dao;

import com.jspiders.hibernate_demo.dto.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductDao {
    public static void deleteProduct(int prodId){
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("development");

        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Product product = entityManager.find(Product.class ,  prodId);
        if(product!=null){

            entityTransaction.begin();
            entityManager.remove(product);
            entityTransaction.commit();
            System.out.println("Data added Successfully");

        }else{
            System.out.println("invalid id .. enter the id");
        }


    }
    public static void updateProduct(int prodId){
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("development");

        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Product product = entityManager.find(Product.class ,  prodId);
        if(product!=null){
            product.setPrice("50000");
            entityTransaction.begin();
            entityManager.persist(product);
            entityTransaction.commit();
            System.out.println("Data added Successfully");

        }else{
            System.out.println("invalid id .. enter the id");
        }


    }

    public static void findProduct(int prodId){
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("development");

        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Product product = entityManager.find(Product.class ,  prodId);
        if(product!=null){
            System.out.println(product.getProdId()+" "+product.getName()+" "+product.getPrice()+" "+product.getType());
        }else{
            System.out.println("enter the correct product id");
        }

    }

    public static void insertProduct(int prodID,String Name , String price ,String type)
    {
        Product p1 = new Product();
        p1.setProdId(prodID);
        p1.setName(Name);
        p1.setPrice(price);
        p1.setType(type);
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("development");

        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(p1);
        entityTransaction.commit();
        System.out.println("product added Successfully");
    }

}
