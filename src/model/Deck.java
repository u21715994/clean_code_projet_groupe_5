package model;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final String ID = "1";
    private final Player player;
    List<Hero> cards;

    public Deck(Player player) {
        this.player = player;
        this.cards = new ArrayList<Hero>();
    }

    public String getID() {
        return ID;
    }

    public void addCardsToDeck(Hero hero){
        cards.add(hero);
    }
}
