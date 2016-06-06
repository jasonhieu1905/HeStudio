package com.hestudio.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hestudio.dao.AbstractDAO;

public abstract class AbstractDAOImpl implements AbstractDAO {
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

}
