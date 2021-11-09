package net.sqits.cardssorter.comparators;

import net.sqits.cardssorter.entities.Card;
import net.sqits.cardssorter.utils.Game;

import java.util.Comparator;

public class ValueComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return Game.faceOrder.indexOf(o1.getCardFace()) - Game.faceOrder.indexOf(o2.getCardFace());
    }
}
