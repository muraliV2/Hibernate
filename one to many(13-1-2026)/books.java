package com.hibernate.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class books 
{
@Id
private int bookId;
private String title;
private String author;
private int pages;
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}

}
