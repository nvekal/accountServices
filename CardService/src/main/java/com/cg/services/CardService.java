package com.cg.services;

import java.util.List;

import com.cg.domain.Card;

public interface CardService {
	
	public Card findCard(long id); 
	public List<Card> findCards();
	public Card createCard(Card account);
}
