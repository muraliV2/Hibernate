package com.hibernate.manyne;

import com.hibernate.dao.doctordao;
import com.hibernate.dao.hospitaldao;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//    	hospitaldao.insertdata(101, "Fortis Hospital", "Bangalore");
//    	hospitaldao.insertdata(102, "AIIMS", "New Delhi");
//    	doctordao.insertdata(8, "Dr. Ravi", 46, "Male", 103);
//    	doctordao.insertdata(9, "Dr. Sneha", 34, "Female", 103);

    	
    	hospitaldao.read(101);
    	
    }
}
