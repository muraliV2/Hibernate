package com.jspiders.hibernate_demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Persistence;

@Entity
public class Product {

        @Id
        private int prodId;
        private String name;
        private String price;
        private String type;




    public Product() {
    }

    public Product(int prodId, String name, String price, String type) {

        this.prodId = prodId;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
