package net.sqits.cardssorter.enums;

/**
 * Enum that contains all possible card values
 */
public enum CardFace {
    ACE(1),
    KING(2),
    QUEEN(3),
    JACK(4),
    TEN(5),
    NINE(6),
    EIGHT(7),
    SEVEN(8),
    SIX(9),
    FIVE(10),
    FOUR(11),
    THREE(12),
    TWO(13);

    private int value;

    CardFace(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
