package com.rbfe.controller;

public class Account {
	String id;
	String name;
	String cardNumber;
	String expiry;
	int points;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Account(String id, String name, String cardNumber, String expiry, int points) {
		super();
		this.id = id;
		this.name = name;
		this.cardNumber = cardNumber;
		this.expiry = expiry;
		this.points = points;
	}
	

}
