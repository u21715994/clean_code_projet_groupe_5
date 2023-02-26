package domain.functional.service;

import database.InMemoryDatabasePlayer;
import domain.functional.model.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpdatePlayerInDatabaseServiceTest {
    @Test
    public void updatePlayerTest(String id, Player player){
        InMemoryDatabasePlayer.IN_MEMORY_DATABASE.put(id, player);
        assertTrue(InMemoryDatabasePlayer.IN_MEMORY_DATABASE.get(id).equals(player));
    }
}
