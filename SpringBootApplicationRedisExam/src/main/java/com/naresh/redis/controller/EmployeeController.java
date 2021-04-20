package com.naresh.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.redis.model.Employee;
import com.naresh.redis.service.IEmployeeSerivce;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private IEmployeeSerivce service;
	
	//@PostMapping("/save")
	@GetMapping("/save")
	public Employee createEmployee(@RequestBody Employee employee) {
		return service.createEmployee(employee);
	}
}
