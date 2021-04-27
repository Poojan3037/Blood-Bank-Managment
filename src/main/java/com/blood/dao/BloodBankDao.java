package com.blood.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.blood.entities.BloodBank;

public class BloodBankDao {

	private SessionFactory factory;
	
	public BloodBankDao(SessionFactory factory) {
		this.factory=factory;
	}
	
	
	public BloodBank getCampByID(int id) {
		
		BloodBank bank;
		
		Session session=this.factory.openSession();
		
		bank=session.get(BloodBank.class, id);
		
		return bank;
	}
	
}
