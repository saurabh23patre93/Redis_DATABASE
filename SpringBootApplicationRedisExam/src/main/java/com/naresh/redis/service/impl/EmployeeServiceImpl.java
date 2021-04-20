package com.naresh.redis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.redis.model.Employee;
import com.naresh.redis.repo.EmployeeRepository;
import com.naresh.redis.service.IEmployeeSerivce;

@Service
public class EmployeeServiceImpl implements IEmployeeSerivce{
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Employee createEmployee(Employee employee) {
		
		return repo.save(employee);
	}

}
