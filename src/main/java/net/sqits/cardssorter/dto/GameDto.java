package net.sqits.cardssorter.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.sqits.cardssorter.entities.Card;
import net.sqits.cardssorter.utils.Game;
import net.sqits.cardssorter.enums.CardColor;
import net.sqits.cardssorter.enums.CardFace;

import java.util.List;

@Getter
@Setter
@Builder
public class GameDto {
    private  List<CardColor> colorOrder;
    private List<CardFace> faceOrder;
    private List<Card> hand;

    public static GameDto getGameDto() {
        return GameDto.builder()
                .colorOrder(Game.colorOrder)
                .faceOrder(Game.faceOrder)
                .hand(Game.hand)
                .build();
    }
}
