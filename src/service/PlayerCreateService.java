package service;

import model.Player;

public class PlayerCreateService {
    public Player createPlayer(String name){
       return new Player(name);
    }
}
