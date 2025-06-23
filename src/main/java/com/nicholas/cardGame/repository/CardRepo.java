package com.nicholas.cardGame.repository;

import com.nicholas.cardGame.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CardRepo extends JpaRepository<Card, Integer> {
    List<Card> findByDeckId(int id);
}
