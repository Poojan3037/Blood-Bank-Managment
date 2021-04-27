package com.blood.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	
	@OneToMany(mappedBy = "city")
	private List<BloodBank> bloodBank=new ArrayList<BloodBank>();


	


	public City(String cname, List<BloodBank> bloodBank) {
		super();
		this.cname = cname;
		this.bloodBank = bloodBank;
	}


	public City(int cid, String cname, List<BloodBank> bloodBank) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.bloodBank = bloodBank;
	}


	public City(String cname) {
		super();
		this.cname = cname;
	}

	public City() {
		
	}

	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public List<BloodBank> getBloodBank() {
		return bloodBank;
	}


	public void setBloodBank(List<BloodBank> bloodBank) {
		this.bloodBank = bloodBank;
	}


	

	
	
}
