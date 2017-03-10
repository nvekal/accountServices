package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.dao.AccountDao;
import com.cg.domain.Account;

import ch.qos.logback.core.net.SyslogOutputStream;

public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountDao accountDao;
	
	public AccountServiceImpl(AccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}

	
	public AccountServiceImpl() {
		super();
	}


	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	
	
	public List<Account> findAccounts() {
		
		List<Account> accounts = accountDao.findAll();
		
		return accounts;
	}

	
	public Account findAccount(long id) {
						
		Account dataAccount = accountDao.findOne(id);
		
		return dataAccount;
	}

	@Override
	public Account createAccount(Account account) {
						
		accountDao.save(account);
		
		return account;
	}

}
