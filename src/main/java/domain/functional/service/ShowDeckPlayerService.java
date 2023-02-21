package domain.functional.service;

import domain.functional.model.Deck;
import domain.functional.model.Player;

public class ShowDeckPlayerService {
    public static Deck showDeck(Player player){
        return player.getDeck();
    }
}
