package com.tameen.dao;


import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tameen.model.User;


@Repository("userDao")
@Transactional
public class UserDaoImpl extends BaseDaoImpl implements UserDao {
	
	private static final long serialVersionUID = 3133549626422614315L;
	
	
	@Override
	public User getUserByUsername(String username) {	
		Criteria cr = getSession().createCriteria(User.class);
		cr.add(Restrictions.eq("userName", username));
		User domainUser = getUniqueObject(User.class, cr);
		return domainUser ;
	}

}
