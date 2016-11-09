package com.tameen.service;

import com.tameen.model.Member;

public interface SearchService {
	
	public Member findEmployeeById(long empId);
	public Member findEmployeeByIqamaId(long iqamaId);

}
