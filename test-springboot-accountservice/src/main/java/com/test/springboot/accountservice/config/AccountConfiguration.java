package com.test.springboot.accountservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.springboot.accountservice.domain.Account;

@Configuration
public class AccountConfiguration {
	
	@Bean
	public Account getAccount() {
		return new Account();
	}
}
