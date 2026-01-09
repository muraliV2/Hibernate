package com.qsp.dao;

import java.util.List;

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
public static void findDepartment(int id) {

    department department = manager.find(department.class, id);

    if (department == null) {
        System.out.println("Department not found");
        return;
    }

    employee employeese = department.getListofemployee();

    com.qsp.dto.employee[] employees = null;
	for (employee employee : employees) {
        System.out.println(employee.getEmpid());
        System.out.println(employee.getName());
        System.out.println(employee.getDesignation());
        System.out.println(employee.getHiredate());
        System.out.println(employee.getCommision());
        System.out.println(employee.getSalary());
        System.out.println("-------------------");
    }
}

public static void detail(int deptId) {

    department depart = manager.find(department.class, deptId);

    if (depart == null) {
        System.out.println("Department not found");
        return;
    }

    // ✅ Check department conditions first
    if (!depart.getName().equalsIgnoreCase("sales")
            || !depart.getLocation().equalsIgnoreCase("newyork")) {
        System.out.println("Department is not Sales from New York");
        return;
    }

    List<employee> employees = depart.getListofemployee();

    if (employees == null || employees.isEmpty()) {
        System.out.println("No employees in this department");
        return;
    }

    for (employee employee : employees) {

        // ✅ Check salary & commission
        if (employee.getClass() != null && employee.getSalary() != null) {

            System.out.println("Emp No     : " + employee.getEmpid());
            System.out.println("Name       : " + employee.getName());
            System.out.println("Job        : " + employee.getJob());
            System.out.println("Hire Date  : " + employee.getHiredate());
            System.out.println("Commission : " + employee.getClass());
            System.out.println("Salary     : " + employee.getSalary());
            System.out.println("-----------------------------");
        }
    }
}



}
