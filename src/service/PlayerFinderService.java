package service;

import database.InMemoryDatabasePlayer;
import model.Hero;
import model.Player;

public class PlayerFinderService {
    public InMemoryDatabasePlayer inMemoryDatabasePlayer;
    public Player findPlayer(String ID){
        return inMemoryDatabasePlayer.findPlayerByID(ID);
    }
}
