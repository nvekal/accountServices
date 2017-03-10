package com.cg.services;

import java.util.List;

import com.cg.domain.Account;

public interface AccountService {
	
	public Account findAccount(long id); 
	public List<Account> findAccounts();
	public Account createAccount(Account account);
}
