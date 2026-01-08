package com.hibernate.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class idcard 
{
	@Id
private int id;
private int cardnumber;
private String issuedate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCardnumber() {
	return cardnumber;
}
public void setCardnumber(int cardnumber) {
	this.cardnumber = cardnumber;
}
public String getIssuedate() {
	return issuedate;
}
public void setIssuedate(String issuedate) {
	this.issuedate = issuedate;
}
}
