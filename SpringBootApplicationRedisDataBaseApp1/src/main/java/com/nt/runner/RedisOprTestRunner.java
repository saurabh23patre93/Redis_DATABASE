/**
 * 
 */
package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.dao.IPersonDAO;
import com.nt.model.Person;

/**
 * @author asus
 *
 */

@Component
public class RedisOprTestRunner implements CommandLineRunner {
	
	@Autowired
	private IPersonDAO dao;
	
	@Override
	public void run(String... args) throws Exception {
		dao.addPerson(new Person(10,"A",52));
		dao.addPerson(new Person(11,"B",56));
		
		dao.getAllPersons().forEach((k,v)->System.out.println(k+"-"+v));
		System.out.println(dao.getPerson(10));
	}

}
