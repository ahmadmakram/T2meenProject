package com.tameen.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tameen.model.Member;

@Repository
@Transactional
public class MemberDaoImpl extends BaseDaoImpl implements MemberDao {
	private static final long serialVersionUID = 1L;
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Member findMemberByEmpId(long empId) {
		Member result = new Member();
		try {
			Criteria cri = sessionFactory.getCurrentSession().createCriteria(Member.class);
			cri.createAlias("empId", "employee");
			cri.add(Restrictions.eq("employee.id", empId));
			result= (Member) getUniqueObject(Member.class, cri);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Member findMemebrByIqamaId(long idNumber) {
		Member result = new Member();
		try {
			Criteria cri = sessionFactory.getCurrentSession().createCriteria(Member.class);
			cri.add(Restrictions.eq("idNumber", idNumber));
			result= (Member) getUniqueObject(Member.class, cri);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
