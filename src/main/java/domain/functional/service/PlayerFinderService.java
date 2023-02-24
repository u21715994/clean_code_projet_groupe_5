package domain.functional.service;

import database.InMemoryDatabasePlayer;
import domain.functional.model.Player;

//Instace Database
public class PlayerFinderService {
    public static InMemoryDatabasePlayer inMemoryDatabasePlayer;
    public static Player findPlayer(String ID){
        return inMemoryDatabasePlayer.findPlayerByID(ID);
    }
}
