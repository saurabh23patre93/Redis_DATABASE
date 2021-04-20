package com.nt.dao.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import com.nt.dao.IPersonDAO;
import com.nt.model.Person;

@Repository
public class PersonDAOImpl implements IPersonDAO{
	
	private final String KEY="PERSON";
	
	@Resource(name = "rt")
	private HashOperations<String,Integer,Person> opr;

	@Override
	public void addPerson(Person person) {
		opr.putIfAbsent(KEY,person.getId(), person);
		
	}
	
	@Override
	public Person getPerson(Integer id) {
		
		return opr.get(KEY, id);
	}
	
	@Override
	public Map<Integer, Person> getAllPersons() {
		
		return opr.entries(KEY);
	}
}
