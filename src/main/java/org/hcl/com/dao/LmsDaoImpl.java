package org.hcl.com.dao;

import org.hcl.com.entity.Leaves;
import org.hcl.com.entity.Manager;
import org.hcl.com.entity.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LmsDaoImpl implements LmsDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	@Override
	public Leaves userLeaveDetails() {

		return (Leaves)getSession().createCriteria(Leaves.class).uniqueResult();
	}

	@Override
	public String addUser(User user) {
		getSession().save(user);
		return user.getUsername();
	}

	@Override
	public String addManager(Manager manager) {
		getSession().save(manager);
		return manager.getManagerName();
	}

	@Override
	public String addUserLeave(Leaves leaves) {
		getSession().save(leaves);
		return "added leaves";
	}

}
