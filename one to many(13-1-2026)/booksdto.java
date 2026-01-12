package com.hibernate.dto;

import java.util.List;



import com.hibernate.dao.books;
import com.hibernate.dao.library;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class booksdto 
{
	 static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	static  EntityManager manager = factory.createEntityManager();
	static  EntityTransaction transaction = manager.getTransaction();
public static void insertdata(int bookId,String title,String author,int pages,int libraryId)
{
	books bk = new books();
	bk.setBookId(bookId);
	bk.setTitle(title);
	bk.setAuthor(author);
	bk.setPages(pages);
	library lb = manager.find(library.class, libraryId);
	if(lb != null)
	{
		List<books> book = lb.getBook();
		book.add(bk);
		transaction.begin();
		manager.persist(bk);
		transaction.commit();
		
	}
	else
	{
		System.out.println("check for erors");
	}
			
	
	
}
}
