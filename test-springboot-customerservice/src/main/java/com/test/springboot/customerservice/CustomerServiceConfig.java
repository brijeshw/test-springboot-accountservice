package com.test.springboot.customerservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.springboot.customerservice.domain.Contact;
import com.test.springboot.customerservice.domain.Customer;

@Configuration
public class CustomerServiceConfig {
	
	@Bean
	public Customer getCustomer() {
		return new Customer();
	}
	
	@Bean
	public Contact getContact() {
		return new Contact();
	}

}
