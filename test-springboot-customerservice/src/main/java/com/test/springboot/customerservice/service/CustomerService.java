package com.test.springboot.customerservice.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.test.springboot.customerservice.domain.Contact;
import com.test.springboot.customerservice.domain.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private ApplicationContext context;
	
	private HashMap<String, Customer> customerMap = new HashMap<>();
	
	public CustomerService() {
		populateCustomers();
	}
	
	public Customer getCustomerDetails(String customerId) {
		return lookupCustomer(customerId);
	}
	
	private Customer lookupCustomer(String customerId) {
		return customerMap.get(customerId);
	}
	
	private void populateCustomers() {
		Customer customer;
		Contact contact;
		if(context!=null) {
			customer = context.getBean(Customer.class);
		}
		else {
			System.out.println(">>>>> Context is nulll");
			customer = new Customer();
		}
		customer.setFirstName("Brijesh");
		customer.setFamilyName("Walia");
		customer.setAge(40);
		customer.setEmail("brijesh.walia@mindtree.com");
		
		if(context!=null) {
			contact = context.getBean(Contact.class);
		}
		else {
			System.out.println(">>>>> Context is nulll contact");
			contact = new Contact();
		}
		contact.setMobileNumber("9811438895");
		contact.setHomeNumber("NA");
		customer.setContact(contact);
		
		customerMap.put("100", customer);
	}
}
