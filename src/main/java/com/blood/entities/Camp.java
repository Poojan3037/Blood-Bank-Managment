package com.blood.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Camp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	private String address;
	private String contact;
	private String open;
	private String date;
	private String city;
	private String organize;
	
	public Camp() {
		
	}
	
	
	public Camp(int cid, String name, String address, String contact, String open, String date, String city,
			String organize) {
		super();
		this.cid = cid;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.open = open;
		this.date = date;
		this.city = city;
		this.organize = organize;
	}

	

	public Camp(String name, String address, String contact, String open, String date, String city, String organize) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.open = open;
		this.date = date;
		this.city = city;
		this.organize = organize;
	}


	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getOrganize() {
		return organize;
	}
	public void setOrganize(String organize) {
		this.organize = organize;
	}
	
	
	
	
}
