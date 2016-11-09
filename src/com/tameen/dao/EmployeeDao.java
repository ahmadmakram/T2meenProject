package com.tameen.dao;

import com.tameen.model.Employee;

public interface EmployeeDao {
	
	public boolean addEmployee(Employee emp);

	public Employee findEmployeeById(long empId);

}
