package org.bhagat.hritu.dao;

import java.util.List;

import org.bhagat.hritu.dto.UserDTO;
import org.bhagat.hritu.exception.DatabaseException;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDAOHibImpl extends HibernateTemplate implements UserDAOInt {

	private static Logger log = LoggerFactory.getLogger(UserDAOHibImpl.class);

	@Autowired(required = true) // default value is true only so no need to
								// specify, but if false it will ignore this
								// property and won't throw any exception
	private SessionFactory sessionFactory;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		log.debug("Setting SessionFactory");
		this.sessionFactory = sessionFactory;
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public void afterPropertiesSet() {
		log.debug("Checking if sessionFactory is set::{}", this.sessionFactory);
		System.out.println("Checking if sessionFactory is set::" + this.sessionFactory);
		setSessionFactory(sessionFactory);
		super.afterPropertiesSet();
	}

	@SuppressWarnings("unchecked")
	public UserDTO findByLogin(String login) throws DatabaseException {
		log.debug("DAO findByLogin Started");
		UserDTO dto = null;
		try {
			DetachedCriteria criteria = DetachedCriteria.forClass(UserDTO.class);
			criteria.add(Restrictions.eq("login", login));
			List<UserDTO> list = findByCriteria(criteria);
			if (list.size() == 1) {
				dto = list.get(0);
			}
		} catch (HibernateException e) {
			log.error("Database Exception....{}", e);
			throw new DatabaseException("Exception: Exception in getting User by Login");
		}
		log.debug("DAO findByLogin Ended");
		return dto;
	}

	public void update(UserDTO dto) throws DatabaseException {
		log.debug("DAO update Started");
		try {
			super.update(dto);
		} catch (HibernateException e) {
			log.error("Database Exception::{}", e);
			throw new DatabaseException("Exception : Exception in update user");
		}
		log.debug("DAO update Ended");
	}

}
