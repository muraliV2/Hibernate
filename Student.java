package com.jspiders.hibernate.demo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student 
{

    @Id
    private int rollno;
    private String name;
    private int age;
    private String contact;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

   
    public Student() {}

    public Student(int rollno, String name, int age, String contact) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    // getters & setters
}
