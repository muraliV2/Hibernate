package com.qsp.dao;

import com.qsp.dto.department;
import com.qsp.dto.employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class employeedao {
static EntityManagerFactory  factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();

public static  void insertdata(int empid,String name,String designation,String hiredate,int salary,int managerID,int Commision,int DepartmentID)
{

employee emp = new employee();
transaction.begin();
emp.setEmpid(empid);
emp.setName(name);
emp.setDesignation(designation);
emp.setHiredate(hiredate);
emp.setSalary(salary);
emp.setManagerID(managerID);
emp.setCommision(Commision);
department dept = manager.find(department.class, DepartmentID);
emp.setDepartment(dept);

manager.persist(emp);
transaction.commit();


}
public static void delete(int empid)
{
	employee emp = manager.find(employee.class, empid);
	transaction.begin();
	manager.remove(emp);
	transaction.commit();
	
	
}



}
