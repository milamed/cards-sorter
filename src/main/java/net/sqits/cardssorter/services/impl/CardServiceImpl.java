package net.sqits.cardssorter.services.impl;

import net.sqits.cardssorter.comparators.ColorComparator;
import net.sqits.cardssorter.comparators.ValueComparator;
import net.sqits.cardssorter.entities.Card;
import net.sqits.cardssorter.entities.Deck;
import net.sqits.cardssorter.utils.Game;
import net.sqits.cardssorter.enums.CardColor;
import net.sqits.cardssorter.enums.CardFace;
import net.sqits.cardssorter.services.CardService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardServiceImpl implements CardService {

    @Value("${hand.cards.number}")
    private int handCardLimit;

    @Override
    public List<CardColor> getRandomColorOrder() {
        List<CardColor> colors = Arrays.asList(CardColor.values());
        Collections.shuffle(colors);
        return colors;
    }

    @Override
    public List<CardFace> getRandomFaceOrder() {
        List<CardFace> faces = Arrays.asList(CardFace.values());
        Collections.shuffle(faces);
        return faces;
    }

    @Override
    public List<Card> getHand(Deck deck) {
        List<Card> deckCards = deck.getCards();
        Collections.shuffle(deckCards);
        return deckCards.subList(0,handCardLimit);
    }

    @Override
    public void sortHand(Deck deck) {
        Game.colorOrder = this.getRandomColorOrder();
        Game.faceOrder = this.getRandomFaceOrder();
        Game.hand = this.getHand(deck)
                .stream()
                .sorted(new ColorComparator().thenComparing(new ValueComparator()))
                .collect(Collectors.toList());

    }
}
