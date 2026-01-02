package com.hinernate.dto;

import com.hibernate.dto.capital;
import com.hibernate.dto.state;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class stateDao 
{
static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();

public static void insertdata(int StateId,String StateName,String StateCode,String CountryName)
{
	
	state st = new state();
	st.setStateId(StateId);
	st.setStateName(StateName);
	st.setStateCode(StateCode);
	st.setCountryName(CountryName);
	  transaction.begin();
      manager.persist(st);
      transaction.commit();
}
public static void updatedata(int StateId,String StateName,String StateCode,String CountryName)
{
state st = manager.find(state.class, StateId);
if(st != null)
{
	transaction.begin();
st.setStateName(StateName);
st.setStateCode(StateCode);
st.setCountryName(CountryName);
transaction.commit();
}
else
{
System.out.println("check the code it has some errros");	
}
}
public static void readdat(int Stateid)
{
state st = manager.find(state.class, Stateid);
if(st != null)
{
System.out.println(st.getStateName() + " " + st.getStateCode() + " " + st.getCountryName());	
}
else
{
System.out.println("check the error in your code");	
}
}
public static void delete(int Stateid)
{
	state st = manager.find(state.class, Stateid);
	transaction.begin();
	manager.remove(st);
	transaction.commit();
}
}
