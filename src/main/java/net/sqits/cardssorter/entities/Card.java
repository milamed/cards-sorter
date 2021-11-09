package net.sqits.cardssorter.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.sqits.cardssorter.enums.CardColor;
import net.sqits.cardssorter.enums.CardFace;

@Getter
@Setter
@Builder
public class Card {
    private CardColor cardColor;
    private CardFace cardFace;
}
