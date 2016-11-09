package com.tameen.service;

import java.io.Serializable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tameen.dao.UserDao;
import com.tameen.model.User;

@Service
public class UserServiceImpl implements UserService, Serializable {
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserDao userDao;


	@Override
	public User getUserByUsername(String username) {
		
		return userDao.getUserByUsername(username);
	}
}
