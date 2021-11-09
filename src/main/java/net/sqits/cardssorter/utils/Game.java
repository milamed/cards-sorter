package net.sqits.cardssorter.utils;

import net.sqits.cardssorter.entities.Card;
import net.sqits.cardssorter.enums.CardColor;
import net.sqits.cardssorter.enums.CardFace;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static List<CardColor> colorOrder = new ArrayList<>();
    public static List<CardFace> faceOrder = new ArrayList<>();
    public static List<Card> hand = new ArrayList<>();
}
