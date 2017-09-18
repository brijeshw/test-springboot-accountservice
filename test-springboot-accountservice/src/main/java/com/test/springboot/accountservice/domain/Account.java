package com.test.springboot.accountservice.domain;

import org.springframework.stereotype.Component;

@Component
public class Account {
	String accountNumber;
	String accountType;
	String accountHolderFName;
	String accountHolderLName;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountHolderFName() {
		return accountHolderFName;
	}
	public void setAccountHolderFName(String accountHolderFName) {
		this.accountHolderFName = accountHolderFName;
	}
	public String getAccountHolderLName() {
		return accountHolderLName;
	}
	public void setAccountHolderLName(String accountHolderLName) {
		this.accountHolderLName = accountHolderLName;
	}
	
	
}
