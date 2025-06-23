package com.nicholas.cardGame.controller;

import com.nicholas.cardGame.dto.DeckDto;
import com.nicholas.cardGame.model.Deck;
import com.nicholas.cardGame.repository.DeckRepo;
import com.nicholas.cardGame.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/decks")
public class DeckController {
    @Autowired
    private final DeckRepo deckRepo;

    @Autowired
    private DeckService deckService;

    public DeckController(DeckRepo deckRepo) {
        this.deckRepo = deckRepo;
    }

    @GetMapping
    Iterable<Deck> getDecks(){
        return deckRepo.findAll();
    }

    @GetMapping("/{id}")
    DeckDto getDeckById(@PathVariable int id) {
        return deckService.buildDeck(id);
    }
}
