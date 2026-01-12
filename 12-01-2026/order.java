
package com.hibernate.dao;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class order 
{
	@Id
	private int  orderid;
	private String date;
	@ManyToOne
	@JoinColumn(name = "Deliver_id", referencedColumnName =   "deliverid")
	private delivery del;
	
	@ManyToOne
	@JoinColumn(name = "customer_id",referencedColumnName = "customerid")
	private customer cust;
	
	@ManyToMany
	@JoinTable(name = "order_product",
   joinColumns =   @JoinColumn(name = "order_id"),
   inverseJoinColumns =   @JoinColumn(name = "product_id"))
	private List<product> listofproducts;
	

	

	public delivery getDel() {
		return del;
	}
	public void setDel(delivery del) {
		this.del = del;
	}
	public customer getCust() {
		return cust;
	}
	public void setCust(customer cust) {
		this.cust = cust;
	}
	public List<product> getListofproducts() {
		return listofproducts;
	}
	public void setListofproducts(List<product> listofproducts) {
		this.listofproducts = listofproducts;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
