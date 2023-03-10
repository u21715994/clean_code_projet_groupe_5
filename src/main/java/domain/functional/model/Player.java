package domain.functional.model;
import lombok.Value;

import java.util.List;

@Value
public class Player {
    String ID;
    String name;

    Deck deck;
    long token;
    long numberBattleWin;

    public Player(String name){
        this.name = name;
        this.ID = "1";
        this.token = 4;
        this.deck = new Deck();
        this.numberBattleWin = 0;
    }

    public Player(Player player, int tokenRequired,List<Hero> heroes){
        this.name = player.name;
        this.ID = player.ID;
        this.deck = new Deck();
        this.token = player.token - tokenRequired;
        for(Hero hero: player.deck.getCards()){
            this.deck.getCards().add(hero);
        }
        for(Hero hero: heroes){
            this.deck.getCards().add(hero);
        }
        this.numberBattleWin = player.numberBattleWin;
    }

    public Player(Player player, int token, int numberBattleWin){
        this.name = player.name;
        this.ID = player.ID;
        this.deck = new Deck();
        this.token = player.token + token;
        for(Hero hero: player.deck.getCards()){
            this.deck.getCards().add(hero);
        }
        this.numberBattleWin = player.numberBattleWin+numberBattleWin;
    }

    public String getID() {
        return ID;
    }

    public long getNumberBattleWin() {
        return numberBattleWin;
    }

    public Player playerWinBattle(Player player, int token, int numberBattleWin){
        return new Player(player, token, numberBattleWin);
    }

    public boolean playerLoss(){
        return this.deck.getCards().size() == 0;
    }
}
