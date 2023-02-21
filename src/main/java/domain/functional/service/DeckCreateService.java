package domain.functional.service;

import domain.functional.model.Deck;
import domain.functional.model.Player;

public class DeckCreateService {
    public Deck createDeck(Player player){
        return new Deck();
    }
}
