package database;

import domain.functional.model.Player;

import java.util.concurrent.ConcurrentHashMap;

public class InMemoryDatabasePlayer {
    private static InMemoryDatabasePlayer INSTANCE;
    public static final java.util.Map<String, Player> IN_MEMORY_DATABASE = new ConcurrentHashMap<>();

    private InMemoryDatabasePlayer() {
    }

    public static synchronized InMemoryDatabasePlayer getInstance() {
        if (INSTANCE == null) {
            return new InMemoryDatabasePlayer();
        }
        return INSTANCE;
    }

    public static boolean savePlayer(Player player){
        if(IN_MEMORY_DATABASE.put(player.getID(), player) == null)
            return false;
        return true;
    }

    public static Player findPlayerByID(String ID){
        return IN_MEMORY_DATABASE.get(ID);
    }


}
