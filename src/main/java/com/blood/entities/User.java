package com.blood.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String name;
	private String email;
	private String password;
	@Column(length = 1000)
	private String address;
	private String city;
	private String number;
	private String gender;
	private String bloodGroup;
	private String birthDate;
	private String bloodBefor;
	private String dicease;
	private String positiveHiv;
	private String medication;
	@Column(length = 1000)
	private String description;
	private String role;
	
	
	



	@OneToMany(mappedBy = "user")
	private List<Donnor> donnor=new ArrayList<Donnor>();
	
	@OneToMany(mappedBy = "user2")
	private List<BloodReciver> reciver=new ArrayList<BloodReciver>();
	
	
	



	public User(String name, String email, String password, String address, String city, String number, String gender,
			String bloodGroup, String birthDate, String bloodBefor, String dicease, String positiveHiv,
			String medication, String description, List<Donnor> donnor, List<BloodReciver> reciver) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
		this.number = number;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.birthDate = birthDate;
		this.bloodBefor = bloodBefor;
		this.dicease = dicease;
		this.positiveHiv = positiveHiv;
		this.medication = medication;
		this.description = description;
		this.donnor = donnor;
		this.reciver = reciver;
	}



	public User(int userId, String name, String email, String password, String address, String city, String number,
			String gender, String bloodGroup, String birthDate, String bloodBefor,String dicease,
			String positiveHiv, String medication, String description) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
		this.number = number;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.birthDate = birthDate;
		this.bloodBefor = bloodBefor;
		this.dicease = dicease;
		this.positiveHiv = positiveHiv;
		this.medication = medication;
		this.description = description;
	}



	public User(String name, String email, String password, String address, String city, String number, String gender,
			String bloodGroup, String birthDate, String bloodBefor, String dicease,
			String positiveHiv, String medication, String description) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
		this.number = number;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.birthDate = birthDate;
		this.bloodBefor = bloodBefor;
		this.dicease = dicease;
		this.positiveHiv = positiveHiv;
		this.medication = medication;
		this.description = description;
	}
	
	
	
	
	
	public User(String name, String email, String password, String address, String city, String number, String gender,
			String bloodGroup, String birthDate, String bloodBefor, String dicease, String positiveHiv,
			String medication, String description, List<Donnor> donnor) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
		this.number = number;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.birthDate = birthDate;
		this.bloodBefor = bloodBefor;
		this.dicease = dicease;
		this.positiveHiv = positiveHiv;
		this.medication = medication;
		this.description = description;
		this.donnor = donnor;
	}
	
	



	public User(String name, String email, String password, String address, String city, String number, String gender,
			String bloodGroup, String birthDate, String bloodBefor, String dicease, String positiveHiv,
			String medication, String description, String role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
		this.number = number;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.birthDate = birthDate;
		this.bloodBefor = bloodBefor;
		this.dicease = dicease;
		this.positiveHiv = positiveHiv;
		this.medication = medication;
		this.description = description;
		this.role = role;
	}



	public User() {
		
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getBloodGroup() {
		return bloodGroup;
	}



	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}



	public String getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}



	public String isBloodBefor() {
		return bloodBefor;
	}



	public void setBloodBefor(String bloodBefor) {
		this.bloodBefor = bloodBefor;
	}



	public String isDicease() {
		return dicease;
	}



	public void setDicease(String dicease) {
		this.dicease = dicease;
	}




	public void setPositiveHiv(String positiveHiv) {
		this.positiveHiv = positiveHiv;
	}



	public List<Donnor> getDonnor() {
		return donnor;
	}



	public void setDonnor(List<Donnor> donnor) {
		this.donnor = donnor;
	}



	public String getBloodBefor() {
		return bloodBefor;
	}



	public String getDicease() {
		return dicease;
	}



	public String getPositiveHiv() {
		return positiveHiv;
	}



	public String getMedication() {
		return medication;
	}



	public String isMedication() {
		return medication;
	}



	public void setMedication(String medication) {
		this.medication = medication;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	public List<BloodReciver> getReciver() {
		return reciver;
	}
	
	
	
	public void setReciver(List<BloodReciver> reciver) {
		this.reciver = reciver;
	}
	
	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}
	
}
