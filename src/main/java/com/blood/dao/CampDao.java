package com.blood.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.blood.entities.Camp;


public class CampDao {
	
	private SessionFactory factory;
	
	public CampDao(SessionFactory factory) {
		this.factory=factory;
	}
	
	
	public List<Camp> getAllCamps(){
		
		List<Camp> camps;
		
		Session session=this.factory.openSession();
		
		String hql="from Camp";
		
		Query query=session.createQuery(hql);
		
		camps=query.list();
			
		return camps;
	}
	

}
