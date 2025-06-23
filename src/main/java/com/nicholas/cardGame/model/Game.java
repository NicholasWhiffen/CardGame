package com.nicholas.cardGame.model;

import com.nicholas.cardGame.dto.DeckDto;

import java.util.List;

public class Game {
    private DeckDto playerDeck = new DeckDto();
    private DeckDto opponentDeck = new DeckDto();

    private Hand playerHand = new Hand();
    private Hand opponentHand = new Hand();

    private ScrapPile playerScrapPile = new ScrapPile();
    private ScrapPile opponentScrapPile = new ScrapPile();

    public DeckDto getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(DeckDto playerDeck) {
        this.playerDeck = playerDeck;
    }

    public DeckDto getOpponentDeck() {
        return opponentDeck;
    }

    public void setOpponentDeck(DeckDto opponentDeck) {
        this.opponentDeck = opponentDeck;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }

    public Hand getOpponentHand() {
        return opponentHand;
    }

    public void setOpponentHand(Hand opponentHand) {
        this.opponentHand = opponentHand;
    }

    public ScrapPile getPlayerScrapPile() {
        return playerScrapPile;
    }

    public void setPlayerScrapPile(ScrapPile playerScrapPile) {
        this.playerScrapPile = playerScrapPile;
    }

    public ScrapPile getOpponentScrapPile() {
        return opponentScrapPile;
    }

    public void setOpponentScrapPile(ScrapPile opponentScrapPile) {
        this.opponentScrapPile = opponentScrapPile;
    }

    public Game() {
    }
}
