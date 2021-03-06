package com.saib.capston.models;

import java.time.LocalDateTime;

public class Account {

	private String name;
	private String gender;
	private String email;
	private String phone;
	private String address;
	private double balance;
	private double creditLimit;
	private LocalDateTime creationDate;
	private LocalDateTime lastUpdated;
	private String status;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String name, String gender, String email, String phone, String address, double balance,
			double creditLimit, LocalDateTime creationDate, LocalDateTime lastUpdated, String status,
			String accountType) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.balance = balance;
		this.creditLimit = creditLimit;
		this.creationDate = creationDate;
		this.lastUpdated = lastUpdated;
		this.status = status;
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", accountType=" + accountType + ", balance=" + balance + ", creditLimit=" + creditLimit
				+ ", creationDate=" + creationDate + ", lastUpdated=" + lastUpdated + ", status=" + status + "]";
	}
	
	
	private String accountType;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
