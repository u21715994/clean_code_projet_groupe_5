package service;

import model.Deck;
import model.Player;

public class ShowDeckPlayerService {
    public static Deck showDeck(Player player){
        return player.getDeck();
    }
}
