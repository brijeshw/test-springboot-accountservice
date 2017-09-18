package com.test.springboot.accountservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot.accountservice.domain.Account;
import com.test.springboot.accountservice.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	AccountService service;
	
	@RequestMapping(method=RequestMethod.GET, value="/customer/{customernumber}")
	public List<Account> getCustomerAccounts(@PathVariable("customernumber") String customerno){
		System.out.println("Customer Account request: "+ customerno);
		return service.getCustomerAccounts(customerno);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{accountnumber}")
	public Account getAccount(@PathVariable("accountnumber") String accountno){
		System.out.println("Account request: "+ accountno);
		return service.getAccount(accountno);
	}

}
