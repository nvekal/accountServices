package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.services.AccountService;
import com.cg.services.AccountServiceImpl;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}
	
	@Bean
	public AccountService AccountServiceCall(){
		
		return new AccountServiceImpl();		
	}
	
	
	
}
