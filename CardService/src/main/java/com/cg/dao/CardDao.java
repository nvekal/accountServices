package com.cg.dao;

import java.util.List;

import com.cg.domain.Card;


public interface CardDao {
		
	public void save(Card card);
	public Card findOne(long id);
	public List<Card> findAll();
	

}
