package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CardDao;
import com.cg.domain.Card;

@Service
public class CardServiceImpl implements CardService{
	
	@Autowired
	CardDao cardDao;
	
	public CardServiceImpl(CardDao accountDao) {
		super();
		this.cardDao = accountDao;
	}

	
	public CardServiceImpl() {
		super();
	}


	public CardDao getCardtDao() {
		return cardDao;
	}

	public void setCardtDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}
	
	
	
	public List<Card> findCards() {
		
		List<Card> accounts = cardDao.findAll();
		
		return accounts;
	}

	
	public Card findCard(long id) {
						
		Card dataAccount = cardDao.findOne(id);
		
		return dataAccount;
	}

	@Override
	public Card createCard(Card account) {
						
		cardDao.save(account);
		
		return account;
	}

}
