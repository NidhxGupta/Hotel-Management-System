package com.example.hotelManagementSystem.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Customer")
public class Customer {
	private String name;
	private String gender;
	private String country;
	private String room;
	private String checkInStatus;
	private String number;
	private String deposit;
	private String id;
	
	private String name2;
	private String gender2;
	private String country2;
	private String room2;
	private String checkInStatus2;
	private String number2;
	private String deposit2;
	private String id2;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getCheckInStatus() {
		return checkInStatus;
	}

	public void setCheckInStatus(String checkInStatus) {
		this.checkInStatus = checkInStatus;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}


	public String getName2() {
		return name2;
	}

	public void setName2(String name) {
		this.name2 = name;
	}

	public String getGender2() {
		return gender2;
	}

	public void setGender2(String gender2) {
		this.gender2 = gender2;
	}

	public String getCountry2() {
		return country2;
	}

	public void setCountry2(String country2) {
		this.country2 = country2;
	}

	public String getRoom2() {
		return room2;
	}

	public void setRoom2(String room2) {
		this.room2 = room2;
	}

	public String getCheckInStatus2() {
		return checkInStatus2;
	}

	public void setCheckInStatus2(String checkInStatus2) {
		this.checkInStatus2 = checkInStatus2;
	}

	public String getNumber2() {
		return number2;
	}

	public void setNumber2(String number2) {
		this.number2 = number2;
	}

	public String getDeposit2() {
		return deposit2;
	}

	public void setDeposit2(String deposit2) {
		this.deposit2 = deposit2;
	}

	public String getId() {
		return id;
	}
	
	public String getId2() {
		return id2;
	}
	
}
