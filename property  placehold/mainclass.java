package com.spring.kyval;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
            ApplicationContext context =  new ClassPathXmlApplicationContext("META-INF/bean.xml");
            employee bean =  context.getBean(employee.class);
            System.out.println(bean.getName());
            System.out.println(bean.getEmployeeid());
            System.out.println(bean.getEmail());
            System.out.println(bean.getDep());
            System.out.println(bean.getAddress());
    
}
}
