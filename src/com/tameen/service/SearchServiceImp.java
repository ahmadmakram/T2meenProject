package com.tameen.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tameen.dao.MemberDao;
import com.tameen.model.Member;

@Service
public class SearchServiceImp implements SearchService, Serializable {
	private static final long serialVersionUID = 1L;
	@Autowired
	private MemberDao memberDao;

	@Override
	public Member findEmployeeById(long empId) {
		return memberDao.findMemberByEmpId(empId);
	}

	@Override
	public Member findEmployeeByIqamaId(long iqamaId) {
		return memberDao.findMemebrByIqamaId(iqamaId);

	}
}
