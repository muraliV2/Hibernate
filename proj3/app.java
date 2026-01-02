package com.hibernate.proj2;

import com.hibernate.dto.capital;
import com.hinernate.dto.capitalDao;
import com.hinernate.dto.stateDao;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	stateDao.delete(3);
    	capitalDao.deletedata(3);
    }
}
