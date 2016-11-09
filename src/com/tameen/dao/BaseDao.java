package com.tameen.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;

public interface BaseDao {
	
	SessionFactory getSessionFactory();

	void setSessionFactory(SessionFactory sessionFactory);

	<T> List<T> getAllObjects(Class<T> clazz);
	public <T> T getObjectById(Long id, Class<T> clazz);
	public <T> T getUniqueObject(Class<T> clazz, Criteria criteria);
	void save(Object object);
	
	void deleteObject(Object object);
	
	
}
