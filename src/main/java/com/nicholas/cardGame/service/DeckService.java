package com.nicholas.cardGame.service;

import com.nicholas.cardGame.dto.DeckDto;
import com.nicholas.cardGame.model.Card;
import com.nicholas.cardGame.repository.CardRepo;
import com.nicholas.cardGame.repository.DeckRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

@Service
public class DeckService {
    @Autowired
    private DeckRepo deckRepo;
    @Autowired
    private CardRepo cardRepo;


    public DeckDto buildDeck(int id){
        DeckDto deck = new DeckDto();
        List<Card> cards = cardRepo.findByDeckId(id);

        for (Card card : cards){
            deck.getCards().add(card);
        }
        Collections.shuffle(deck.getCards());
        return deck;

    }
}
