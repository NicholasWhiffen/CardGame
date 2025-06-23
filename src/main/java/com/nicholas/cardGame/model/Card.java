package com.nicholas.cardGame.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;


@Entity

public class Card {
    @Id
    @JsonProperty(value="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @JsonProperty(value="rank")
    @Column(name="rank")
    int rank;

    @JsonProperty(value="tier")
    @Column(name="tier")
    int tier;

    @JsonProperty(value="name")
    @Column(name="name")
    String name;

    @JsonProperty(value="deckId")
    @Column(name="deckId")
    int deckId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeckId() {
        return deckId;
    }

    public void setDeckId(int deck) {
        this.deckId = deckId;
    }

    public Card() {
    }

    public Card(int id, int rank, int tier, int deckId) {
        this.id = id;
        this.rank = rank;
        this.tier = tier;
        this.deckId = deckId;
    }
}
