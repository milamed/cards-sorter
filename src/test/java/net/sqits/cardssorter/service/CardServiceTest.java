package net.sqits.cardssorter.service;

import net.sqits.cardssorter.entities.Deck;
import net.sqits.cardssorter.services.CardService;
import net.sqits.cardssorter.services.impl.CardServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.stream.Collectors;

import static org.junit.Assert.assertNotEquals;


public class CardServiceTest {

    private CardService cardService= new CardServiceImpl();
    private Deck deck = new Deck();

    @Before
    public void setup() {
        ReflectionTestUtils.setField(cardService, "handCardLimit", 10);
    }

    @Test
    public void testGetRandomColorOrder() {
        String firstOrder = this.cardService.getRandomColorOrder().stream()
                .map(Enum::toString)
                .collect(Collectors.joining(","));
        String secondOrder = this.cardService.getRandomColorOrder().stream()
                .map(Enum::toString)
                .collect(Collectors.joining(","));
        assertNotEquals(firstOrder, secondOrder);
    }

    @Test
    public void testGetRandomFaceOrder() {
        String firstOrder = this.cardService.getRandomFaceOrder().stream()
                .map(Enum::toString)
                .collect(Collectors.joining(","));
        String secondOrder = this.cardService.getRandomFaceOrder().stream()
                .map(Enum::toString)
                .collect(Collectors.joining(","));
        assertNotEquals(firstOrder, secondOrder);
    }

    @Test
    public void testGetHand() {
        String firstHand = this.cardService.getHand(this.deck).stream()
                .map(card -> card.getCardFace().toString())
                .collect(Collectors.joining(","));
        String secondHand = this.cardService.getHand(this.deck).stream()
                .map(card -> card.getCardFace().toString())
                .collect(Collectors.joining(","));
        assertNotEquals(firstHand, secondHand);
    }
}
