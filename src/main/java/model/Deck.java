package model;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final String ID = "1";
    List<Hero> cards = new ArrayList<Hero>();

    public Deck() {
        this.cards = new ArrayList<Hero>();
    }

    public Deck(List<Hero> heroes) {
        for(Hero hero: heroes){
            this.cards.add(hero);
        }
    }

    public String getID() {
        return ID;
    }

    public void addCardsToDeck(Hero hero){
        cards.add(hero);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
