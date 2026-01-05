package com.qsp.ontomany;

import com.qsp.dao.departmentdao;
import com.qsp.dao.employeedao;
import com.qsp.dto.department;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	departmentdao.insertdata(40, "hotel", "chennai");
    employeedao.insertdata(3, "neymar", "Testing", "4-feb-2015", 27000, 1, 20, 40);
    	
        
    }
}
