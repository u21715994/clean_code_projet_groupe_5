package domain.functional.service;

import database.InMemoryDatabasePlayer;
import domain.functional.model.Player;

public class UpdatePlayerInDatabaseService {
    public static void updatePlayer(String id, Player player){
        InMemoryDatabasePlayer.IN_MEMORY_DATABASE.put(id, player);
    }
}
