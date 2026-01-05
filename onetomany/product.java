package com.ontomany.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class product 
{
	@Id
private int ProductId;
private String name;
private String type;
private int price;
private int Quantity;
public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
}
