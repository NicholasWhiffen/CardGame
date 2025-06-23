package com.nicholas.cardGame.model;

import java.util.ArrayList;
import java.util.List;

public class ScrapPile {
    private List<Card> scrapPile = new ArrayList<>();

    public List<Card> getScrapPile() {
        return scrapPile;
    }

    public void setScrapPile(List<Card> scrapPile) {
        this.scrapPile = scrapPile;
    }

    public ScrapPile() {
    }
}
