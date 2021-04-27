package com.blood.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.blood.entities.City;

public class CityDao {

private SessionFactory factory;
	
	public CityDao(SessionFactory factory) {
		this.factory=factory;
	}
	
	
	public List<City> getAllCities(){
		
		List<City> cities;
		
		
		Session session=this.factory.openSession();
		
		String hql="from City";
		
		
		Query query=session.createQuery(hql);
		
		cities=query.list();
		
		
		
		
		return  cities;
	}
	
	
	
}
