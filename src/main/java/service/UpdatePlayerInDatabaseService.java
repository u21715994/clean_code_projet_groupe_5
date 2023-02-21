package service;

import database.InMemoryDatabasePlayer;
import model.Player;

public class UpdatePlayerInDatabaseService {
    public static void updatePlayer(String id, Player player){
        InMemoryDatabasePlayer.IN_MEMORY_DATABASE.put(id, player);
    }
}
