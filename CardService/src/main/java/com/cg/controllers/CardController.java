package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.domain.Card;
import com.cg.services.CardService;

@RestController
public class CardController {
	
	@Autowired
	CardService cardService;
		
	public CardService getCardService() {
		return cardService;
	}

	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}


	@RequestMapping("/")
	public String[] helloWorld() {
		
		return new String[]{"Hello", "World"};
		
	}
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	public Card createAccount(@RequestBody Card request) {
		
		return cardService.createCard(request);
		
	}
	
	@RequestMapping("/cards")
	public @ResponseBody List<Card> findAccounts() {
		
		return cardService.findCards();
		
	}
	
	@RequestMapping(value="/card/{id}", method=RequestMethod.POST)
	public @ResponseBody Card findAccount(@PathVariable long id ) {
		
		return cardService.findCard(id);
		
	}
}
