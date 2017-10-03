package com.test.springboot.customerservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot.customerservice.domain.Customer;
import com.test.springboot.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@RequestMapping(method=RequestMethod.GET, value="/{customerId}")
	public Customer getCustomerDetails(@PathVariable("customerId") String customerId) {
		System.out.println("CUstomer Id received: "+ customerId);
		
		return service.getCustomerDetails(customerId);
	}

}
