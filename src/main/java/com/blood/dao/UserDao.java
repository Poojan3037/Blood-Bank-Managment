package com.blood.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.blood.entities.User;

public class UserDao {
	
	private SessionFactory factory;
	
	public UserDao(SessionFactory factory) {
		this.factory=factory;
	}
	
	public User getUSerByEmailPassword(String email,String password) {
		
		User user=null;
		
		Session session=this.factory.openSession();
		
		String hql="from User where email=:e and password=:p";
		
		Query query=session.createQuery(hql);
		
		query.setParameter("e", email);
		query.setParameter("p", password);
		
		
		user=(User) query.uniqueResult();
		
		return user;
	}

}
