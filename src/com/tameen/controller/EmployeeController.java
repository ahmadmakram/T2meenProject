package com.tameen.controller;

import java.io.Serializable;


import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.tameen.model.Employee;
import com.tameen.service.EmployeeService;

@Component("empBean")
public class EmployeeController implements Serializable {
	private static final long serialVersionUID = 1L;
	private Employee employee = new Employee();
	@Autowired
	private EmployeeService empService;
	private Employee emp1;
	private Employee emp2;

	public EmployeeController() {	
	}

	public void addEmployee() {
		emp1 = new Employee();
		emp1.setId(1l);
		emp1.setFirstName("Huong");
		emp1.setLastName("Nguyen");
		emp2 = new Employee();
		emp2.setId(2l);
		emp2.setFirstName("Khang");
		emp2.setLastName("Le");
		empService.addEmployee(emp1);
		empService.addEmployee(emp2);
		employee = empService.findEmployeeById(emp1.getId());
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
