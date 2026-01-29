package com.hibernate.dto;

import com.hibernate.dao.customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class customerdto 
{
 static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
 static EntityManager manager =  factory.createEntityManager();
 static EntityTransaction transaction = manager.getTransaction();
 
 public static void insertdata(int customerid,String name,String email,String address)
 {
	 transaction.begin();
	 customer cust = new customer();
	 cust.setCustomerid(customerid);
	 cust.setName(name);
	 cust.setEmail(email);
	 cust.setAddress(address);
	 
	 manager.persist(cust);
	 transaction.commit();
	 
	 
 }
public static void getorder(int customerid)
{
customer cust = manager.find(customer.class, customerid);
if(cust != null)
{
	 List<ordertab> or = cust.getList();
	 for(ordertab o : or)
	 {
		 
		Delivery d = o.getDel();
		List<products> pw = o.getProduct();
		for(products p : pw)
		{
		 
		 System.out.println(o.getOrderid() + " " + o.getOrderdate() + " " + d.getDeliveryid() + " " + d.getStatus() + " " + d.getType() + " " + p.getCategoryid() + " "+p.getProductname() + " " + p.getProductid());
	 }
	 }
}


}
}

