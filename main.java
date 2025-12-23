package get_set;

import java.sql.DriverManager;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Mainclas 
{
public static void main(String [] args)
{
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("development");
	
}
}


//entity manager
