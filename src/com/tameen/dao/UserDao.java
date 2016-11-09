package com.tameen.dao;

import com.tameen.model.User;

public interface UserDao extends BaseDao {


	User getUserByUsername(String username);
	
}
