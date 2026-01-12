package com.hibernate.dto;

import java.util.List;

import com.hibernate.dao.books;
import com.hibernate.dao.library;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class librarydto 
{
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();
public static void insertdata(int libraryId,String libraryName,String location)
{
	library lib = new library();
	lib.setLibraryId(libraryId);
	lib.setLibraryName(libraryName);
	lib.setLocation(location);
	transaction.begin();
	manager.persist(lib);
	transaction.commit();
}
public static void readdata(int libraryId)
{
library lib = manager.find(library.class, libraryId);
if(lib != null)
{
List<books> book = lib.getBook();	
for(books b : book)
{
System.out.println(b.getBookId() + " " + b.getTitle() + " " + b.getAuthor() + " " + b.getPages() + " " );	
}
}
}
}
