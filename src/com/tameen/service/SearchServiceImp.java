package com.tameen.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tameen.dao.EmployeeDao;
import com.tameen.dao.MemberDao;
import com.tameen.model.Employee;
import com.tameen.model.Member;

@Service
public class SearchServiceImp implements SearchService, Serializable {
	private static final long serialVersionUID = 1L;
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee findEmployeeById(long empId) {
		return employeeDao.findEmployeeById(empId);
	}

	@Override
	public Member findMemberByIqamaId(long iqamaId) {
		return memberDao.findMemebrByIqamaId(iqamaId);

	}
}
