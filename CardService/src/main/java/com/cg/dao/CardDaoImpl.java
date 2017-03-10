package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.domain.Card;

@Repository
public class CardDaoImpl implements CardDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Card card) {
				
		try {
			entityManager.persist(card);
			
		} finally {
			System.out.println("After commit .................");
			entityManager.close();
		}

	}

	
	public Card findOne(long id) {
		
		Card card = (Card) entityManager.find(Card.class, id);
		return card;		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Card> findAll() {				
		
		try {
			Query query = entityManager.createQuery("select card from card card");
			
			return query.getResultList();
		} finally {
			System.out.println("After findAll .................");
			entityManager.close();
		}

	}

}
