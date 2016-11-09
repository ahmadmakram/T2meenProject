package com.tameen.service;

import java.io.Serializable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tameen.dao.EmployeeDao;
import com.tameen.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService, Serializable {
	private static final long serialVersionUID = 1L;
	@Autowired
	private EmployeeDao empDao;

	public Employee findEmployeeById(long empId) {
		return empDao.findEmployeeById(empId);
	}

	public boolean addEmployee(Employee emp) {
		return empDao.addEmployee(emp);
	}
}
