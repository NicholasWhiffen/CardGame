package com.nicholas.cardGame.repository;

import com.nicholas.cardGame.model.Deck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface DeckRepo extends CrudRepository<Deck, Integer> {
}
