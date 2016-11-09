package com.tameen.dao;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("baseDao")
@SuppressWarnings("unchecked")
public class BaseDaoImpl implements BaseDao, Serializable {
	private static final long serialVersionUID = 7327402019291101091L;
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory
	 *            - Hibernate Session Factory
	 */
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void save(Object object) {
		try {
			getSession().saveOrUpdate(object);
		} catch (NonUniqueObjectException e) {
			getSession().merge(object);
		}
	}

	@Override
	public void deleteObject(Object object) {
		Session session = getSessionFactory().getCurrentSession();
		session.delete(object);
	}
	@Override
	public <T> T getObjectById(Long id, Class<T> clazz) {
		return (T) getSession().get(clazz, id);
	}
	@Override
	public <T> T getUniqueObject(Class<T> clazz, Criteria criteria) {		
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return (T) criteria.uniqueResult();
	}
	@Override
	public <T> List<T> getAllObjects(Class<T> clazz) {
		Criteria criteria = getSession().createCriteria(clazz);
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return criteria.list();
	}
	
}
