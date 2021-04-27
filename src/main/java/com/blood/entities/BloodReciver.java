package com.blood.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BloodReciver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reciverid;
	private String reciverBlood;
	private String bankName;
	private String bankAddress;
	private String bankOpen;
	private String bankClose;
	private int number;
	private String city;
	
	@ManyToOne
	private User user2;


	public BloodReciver(int reciverid, String reciverBlood, String bankName, String bankAddress, String bankOpen,
			String bankClose, int number, String city, User user2) {
		super();
		this.reciverid = reciverid;
		this.reciverBlood = reciverBlood;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankOpen = bankOpen;
		this.bankClose = bankClose;
		this.number = number;
		this.city = city;
		this.user2 = user2;
	}

	
	

	public BloodReciver(String reciverBlood, String bankName, String bankAddress, String bankOpen, String bankClose,
			int number, String city, User user2) {
		super();
		this.reciverBlood = reciverBlood;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankOpen = bankOpen;
		this.bankClose = bankClose;
		this.number = number;
		this.city = city;
		this.user2 = user2;
	}




	public BloodReciver(String reciverBlood, String bankName, String bankAddress, String bankOpen, String bankClose,
			int number, String city) {
		super();
		this.reciverBlood = reciverBlood;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankOpen = bankOpen;
		this.bankClose = bankClose;
		this.number = number;
		this.city = city;
	}




	public BloodReciver() {
		
	}


	public int getReciverid() {
		return reciverid;
	}


	public void setReciverid(int reciverid) {
		this.reciverid = reciverid;
	}


	public String getReciverBlood() {
		return reciverBlood;
	}


	public void setReciverBlood(String reciverBlood) {
		this.reciverBlood = reciverBlood;
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


	public User getUser2() {
		return user2;
	}


	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
