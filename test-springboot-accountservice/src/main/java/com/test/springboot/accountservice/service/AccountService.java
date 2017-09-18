package com.test.springboot.accountservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.test.springboot.accountservice.domain.Account;

@Service
public class AccountService {
	
	Map<String, List<Account>> customeraccounts = new HashMap<String, List<Account>>();
	
	public AccountService() {
		populateCustomerAccounts();
	}

	public List<Account> getCustomerAccounts(String customerno){
		return customeraccounts.get(customerno);
	}
	
	public Account getAccount(String accountNumber) {
		if(accountNumber !=null && !"".equals(accountNumber.trim())) {
			Set<Entry<String, List<Account>>> customerSet = customeraccounts.entrySet();
			for (Entry<String, List<Account>> entry : customerSet) {
				List<Account> accounts = entry.getValue();
				for (Account account : accounts) {
					if(accountNumber.trim().equals(account.getAccountNumber())) {
						return account;
					}
				}
			}
		}
		return new Account();
	}
	
	private void populateCustomerAccounts() {
		Account account = new Account();
		
		account.setAccountNumber("1111-111");
		account.setAccountHolderFName("Brijesh");
		account.setAccountHolderLName("Walia");
		account.setAccountType("Savings");
		
		List<Account> accountList = new ArrayList<Account>();
		accountList.add(account);
		customeraccounts.put("123456789", accountList);
		
		account = new Account();
		account.setAccountNumber("2222-2222");
		account.setAccountHolderFName("Jatinder");
		account.setAccountHolderLName("Walia");
		account.setAccountType("Savings");
		
		accountList = new ArrayList<Account>();
		accountList.add(account);
		customeraccounts.put("999999999999", accountList);
		
		account = new Account();
		account.setAccountNumber("3333-3333");
		account.setAccountHolderFName("Deepak");
		account.setAccountHolderLName("Walia");
		account.setAccountType("Savings");
		
		accountList = new ArrayList<Account>();
		accountList.add(account);
		customeraccounts.put("8989889898989", accountList);
		
		
		
	}
}
