package domain.functional.model;
import lombok.Value;

import java.util.List;

@Value
public class Player {
    String ID;
    String name;

    Deck deck;
    long token;

    public Player(String name){
        this.name = name;
        this.ID = "1";
        this.token = 4;
        this.deck = new Deck();
    }

    public Player(Player player, int tokenRequired,List<Hero> heroes){
        this.name = player.name;
        this.ID = player.ID;
        this.deck = new Deck();
        this.token = player.token - tokenRequired;
        for(Hero hero: player.deck.cards){
            this.deck.cards.add(hero);
        }
        for(Hero hero: heroes){
            this.deck.cards.add(hero);
        }
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}
