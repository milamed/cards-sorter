package net.sqits.cardssorter.entities;

import lombok.Getter;
import net.sqits.cardssorter.enums.CardColor;
import net.sqits.cardssorter.enums.CardFace;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = this.populateDeck();
    }

    private List<Card> populateDeck() {
        List<Card> populatedDeck = new ArrayList<>();
        for(CardColor color: CardColor.values()) {
            for(CardFace face: CardFace.values()) {
                Card card = Card.builder()
                        .cardColor(color)
                        .cardFace(face)
                        .build();
                populatedDeck.add(card);
            }
        }
        return populatedDeck;
    }
}
