package net.sqits.cardssorter.controllers;

import net.sqits.cardssorter.dto.GameDto;
import net.sqits.cardssorter.entities.Card;
import net.sqits.cardssorter.entities.Deck;
import net.sqits.cardssorter.enums.CardColor;
import net.sqits.cardssorter.enums.CardFace;
import net.sqits.cardssorter.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/card")
public class CardController {

    private final CardService cardService;
    private final Deck deck;

    @Autowired
    public CardController(CardService cardService, Deck deck) {
        this.cardService = cardService;
        this.deck = deck;
    }

    @GetMapping("/random-colors")
    public ResponseEntity<List<CardColor>> getColorOrder() {
        List<CardColor> randomColorOrder = this.cardService.getRandomColorOrder();
        return new ResponseEntity<>(randomColorOrder, HttpStatus.OK);
    }

    @GetMapping("/random-faces")
    public ResponseEntity<List<CardFace>> getFaceOrder() {
        List<CardFace> randomCardFaces = this.cardService.getRandomFaceOrder();
        return new ResponseEntity<>(randomCardFaces, HttpStatus.OK);
    }

    @GetMapping("/hand")
    public ResponseEntity<List<Card>> getHand() {
        List<Card> hand = this.cardService.getHand(deck);
        return new ResponseEntity<>(hand, HttpStatus.OK);
    }

    @GetMapping("/sorted-hand")
    public ResponseEntity<GameDto> getSortedHand() {
        this.cardService.sortHand(deck);
        return new ResponseEntity<>(GameDto.getGameDto(), HttpStatus.OK);
    }
}
