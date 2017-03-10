package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.domain.Account;
import com.cg.services.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
		
	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}


	@RequestMapping("/")
	public String[] helloWorld() {
		
		return new String[]{"Hello", "World"};
		
	}
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	public Account createAccount(@RequestBody Account request) {
		
		return accountService.createAccount(request);
		
	}
	
	@RequestMapping("/accounts")
	public @ResponseBody List<Account> findAccounts() {
		
		return accountService.findAccounts();
		
	}
	
	@RequestMapping(value="/account/{id}", method=RequestMethod.POST)
	public @ResponseBody Account findAccount(@PathVariable long id ) {
		
		return accountService.findAccount(id);
		
	}
}
