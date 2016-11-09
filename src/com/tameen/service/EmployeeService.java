package com.tameen.service;

import com.tameen.model.Employee;

public interface EmployeeService {

	public Employee findEmployeeById(long empId);
	public boolean addEmployee(Employee emp);
}
