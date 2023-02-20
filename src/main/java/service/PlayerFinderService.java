package service;

import database.InMemoryDatabasePlayer;
import model.Hero;
import model.Player;

public class PlayerFinderService {
    public static InMemoryDatabasePlayer inMemoryDatabasePlayer;
    public static Player findPlayer(String ID){
        return inMemoryDatabasePlayer.findPlayerByID(ID);
    }
}
