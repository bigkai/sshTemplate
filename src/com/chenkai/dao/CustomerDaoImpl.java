package com.chenkai.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.chenkai.domain.Customer;

@Repository
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Autowired
	public void setSupperSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	public void save(Customer customer) {
		this.getHibernateTemplate().save(customer);
	}

}
