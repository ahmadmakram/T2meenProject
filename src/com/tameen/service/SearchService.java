package com.tameen.service;

import com.tameen.model.Employee;
import com.tameen.model.Member;

public interface SearchService {
	
	public Employee findEmployeeById(long empId);
	public Member findMemberByIqamaId(long iqamaId);

}
