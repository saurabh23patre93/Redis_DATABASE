package com.nt.dao;

import java.util.Map;

import com.nt.model.Person;

public interface IPersonDAO {
	public void addPerson(Person person);
	
	public Person getPerson(Integer id);
	public Map<Integer,Person> getAllPersons();
}
