package get_set;

public class student 
{
	
private int rollno;
private String name;
private int age;
private String contact;

public student(int rollno,String name,int age,String contact)
{
	this.rollno = rollno;
	this.name = name;
	this.age = age;
	this.contact = contact;
}

public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	if(rollno>0)
	{
		this.rollno = rollno;
	}
	else
	{
		System.out.println("invalid data");
	}
}
public String getName() {
	return name;
}
public void setName(String name) 
{if(name.matches("[a-zA-z]+"))
{
	this.name = name;	
}
else
{
System.out.println("no special characters allowed");	
}
	
}
public int getAge() {
	return age;
}
public void setAge(int age) 
{
	if(age>10)
	{
		this.age = age;
	}
	else
	{
		System.out.println("your age is too low");
	}
}
public String getContact() {
	return contact;
}
public void setContact(String contact) 
{
	if(contact.matches("[0-9]{10}"))
	this.contact = contact;
	else
	{
		System.out.println("plz provide needed credentials");
	}
}


}
