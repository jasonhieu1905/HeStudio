package com.hestudio.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface AbstractDAO {
	/**
	 * Returns the hibernate {@link Session} for specific Dao.
	 * 
	 * @return the hibernate session.
	 */
	Session getSession();

	/**
	 * Injects the {@link SessionFactory} to Dao implementations.
	 * 
	 * @param sf
	 *            the hibernate ssesion factory.
	 */
	void setSessionFactory(final SessionFactory sf);
}
