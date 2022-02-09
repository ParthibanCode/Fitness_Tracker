package com.example.fitnesstracker.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer app_Id;
	private String name;
	private Integer age;
	private String email;
	private String mobNo;
	private String addrLine1;
	private String addrLine2;
	private String city;
	private String state;
	private String country;
	private Integer pincode;
	private String trainerPreference;
	private String physiotherapistrequirement;
	private String selectpackage;
	private Integer weeks;
	private Integer amount;

	public Integer getApp_Id() {
		return app_Id;
	}

	public void setApp_Id(Integer app_Id) {
		this.app_Id = app_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getAddrLine1() {
		return addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getTrainerPreference() {
		return trainerPreference;
	}

	public void setTrainerPreference(String trainerPreference) {
		this.trainerPreference = trainerPreference;
	}

	public String getPhysiotherapistrequirement() {
		return physiotherapistrequirement;
	}

	public void setPhysiotherapistrequirement(String physiotherapistrequirement) {
		this.physiotherapistrequirement = physiotherapistrequirement;
	}

	public String getSelectpackage() {
		return selectpackage;
	}

	public void setSelectpackage(String selectpackage) {
		this.selectpackage = selectpackage;
	}

	public Integer getWeeks() {
		return weeks;
	}

	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
