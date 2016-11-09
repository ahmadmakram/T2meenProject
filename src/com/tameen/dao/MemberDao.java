package com.tameen.dao;

import com.tameen.model.Member;

public interface MemberDao {

	public Member findMemberByEmpId(long empId);
	public Member findMemebrByIqamaId(long iqamaId);
	
}
