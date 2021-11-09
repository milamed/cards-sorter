package net.sqits.cardssorter.comparators;

import net.sqits.cardssorter.entities.Card;
import net.sqits.cardssorter.utils.Game;

import java.util.Comparator;

public class ColorComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return Game.colorOrder.indexOf(o1.getCardColor()) - Game.colorOrder.indexOf(o2.getCardColor());
    }
}
