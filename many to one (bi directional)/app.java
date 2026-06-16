package com.hibernate.manyne;
import com.hibernate.dao.doctordao;
import com.hibernate.dao.hospitaldao;
public class App {
    public static void main(String[] args) {
//    	hospitaldao.insertdata(101, "Fortis Hospital", "Bangalore");
//    	hospitaldao.insertdata(102, "AIIMS", "New Delhi");

    	
    	hospitaldao.read(101);
    	
    }
}
