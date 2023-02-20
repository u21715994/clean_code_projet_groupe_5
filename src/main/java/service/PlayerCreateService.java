package service;

import model.Hero;
import model.Player;

import java.util.List;

public class PlayerCreateService {
    public static Player createPlayer(String name){
       return new Player(name);
    }

    public static Player createPlayer(Player player, List<Hero> heroesInDeck){
        return new Player(player, heroesInDeck);
    }
}
