package com.blood.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BloodBank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankid;
	private String bankName;
	private String bankAddress;
	private String bankOpen;
	private String bankClose;
	private int number;
	
	
	@ManyToOne
	private City city;


	public BloodBank(int bankid, String bankName, String bankAddress, String bankOpen, String bankClose, int number,
			City city) {
		super();
		this.bankid = bankid;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankOpen = bankOpen;
		this.bankClose = bankClose;
		this.number = number;
		this.city = city;
	}


	public BloodBank(String bankName, String bankAddress, String bankOpen, String bankClose, int number, City city) {
		super();
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankOpen = bankOpen;
		this.bankClose = bankClose;
		this.number = number;
		this.city = city;
	}
	
	


	public BloodBank(String bankName, String bankAddress, String bankOpen, String bankClose, int number) {
		super();
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankOpen = bankOpen;
		this.bankClose = bankClose;
		this.number = number;
	}

	public BloodBank() {
		
	}

	public int getBankid() {
		return bankid;
	}


	public void setBankid(int bankid) {
		this.bankid = bankid;
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


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}
	
	
	
}
