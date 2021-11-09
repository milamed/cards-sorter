package net.sqits.cardssorter.services;

import net.sqits.cardssorter.entities.Card;
import net.sqits.cardssorter.entities.Deck;
import net.sqits.cardssorter.enums.CardColor;
import net.sqits.cardssorter.enums.CardFace;

import java.util.List;

public interface CardService {
    /**
     * get a random order for card's colors
     *
     * @return list of colors
     */
    List<CardColor> getRandomColorOrder();

    /**
     * get a random order for card's faces
     *
     * @return list of faces
     */
    List<CardFace> getRandomFaceOrder();

    /**
     * get a hand of cards
     *
     * @param deck of cards
     * @return list of cards
     */
    List<Card> getHand(Deck deck);

    /**
     * get a hand of sorted cards
     *
     * @param deck of cards
     */
    void sortHand(Deck deck);
}
