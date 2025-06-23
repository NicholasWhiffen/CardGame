package com.nicholas.cardGame.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Deck {
    @Id
    @JsonProperty(value="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @JsonProperty(value="name")
    @Column(name="name")
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck() {
        int id= this.id;
        String name = this.name;
    }

    public Deck(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
