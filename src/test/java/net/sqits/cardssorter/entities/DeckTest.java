package net.sqits.cardssorter.entities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DeckTest {

    @Test
    public void testDeck() {
        Deck deck = new Deck();
        assertEquals(52, deck.getCards().size());
    }

}
