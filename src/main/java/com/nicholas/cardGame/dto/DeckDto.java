package com.nicholas.cardGame.dto;

import com.nicholas.cardGame.model.Card;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DeckDto {
    private List<Card> cards = new ArrayList<>();

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public DeckDto() {
    }
}
