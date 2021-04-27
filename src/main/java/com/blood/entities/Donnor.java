package com.blood.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Generated;

@Entity
public class Donnor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String dBlood;
	private String bankName;
	private String bankAddress;
	private String bankOpen;
	private String bankClose;
	private int number;
	private String city;
	
	
	@ManyToOne
	private User user;
	
	
	public Donnor() {
		
	}


	


	public Donnor(int did, String dBlood, String bankName, String bankAddress, String bankOpen, String bankClose,
			int number, String city, User user) {
		super();
		this.did = did;
		this.dBlood = dBlood;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankOpen = bankOpen;
		this.bankClose = bankClose;
		this.number = number;
		this.city = city;
		this.user = user;
	}





	public Donnor(String dBlood, String bankName, String bankAddress, String bankOpen, String bankClose, int number,
			String city, User user) {
		super();
		this.dBlood = dBlood;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankOpen = bankOpen;
		this.bankClose = bankClose;
		this.number = number;
		this.city = city;
		this.user = user;
	}





	public Donnor(String dBlood, String bankName, String bankAddress, String bankOpen, String bankClose, int number,
			String city) {
		super();
		this.dBlood = dBlood;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankOpen = bankOpen;
		this.bankClose = bankClose;
		this.number = number;
		this.city = city;
	}





	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public String getdBlood() {
		return dBlood;
	}


	public void setdBlood(String dBlood) {
		this.dBlood = dBlood;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getBankAddress() {
		return bankAddress;
	}


	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}


	public String getBankOpen() {
		return bankOpen;
	}


	public void setBankOpen(String bankOpen) {
		this.bankOpen = bankOpen;
	}


	public String getBankClose() {
		return bankClose;
	}


	public void setBankClose(String bankClose) {
		this.bankClose = bankClose;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	

	
	
}
