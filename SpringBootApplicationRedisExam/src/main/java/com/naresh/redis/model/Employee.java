package com.naresh.redis.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE_REDIS")
public class Employee  implements Serializable{
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String empName;
	private Double empSal;
}
