package com.hibernate.dto;

import java.util.List;

import com.hibernate.dao.Delivery;
import com.hibernate.dao.customer;
import com.hibernate.dao.ordertab;
import com.hibernate.dao.products;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class orderdto 
{
static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();

public static void insertdata(int orderid,String orderdate,int customerid,int deliverid)
{
	transaction.begin();
ordertab ord = new ordertab();
customer cust = manager.find(customer.class, customerid);
Delivery del = manager.find(Delivery.class, deliverid);
ord.setOrderid(orderid);
ord.setOrderdate(orderdate);
ord.setCust(cust);
ord.setDel(del);
cust.getList().add(ord);


manager.persist(ord);
transaction.commit();


}

public static void addproducttoorder(int orderid,int ProductId)
{
	transaction.begin();
	ordertab ord = manager.find(ordertab.class, orderid);
	products prod = manager.find(products.class, ProductId);
	ord.getProduct().add(prod);
	prod.getOrder().add(ord);
	
	
	transaction.commit();
}
}
