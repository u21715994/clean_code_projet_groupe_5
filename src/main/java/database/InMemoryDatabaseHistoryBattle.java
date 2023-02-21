package database;

import domain.functional.model.HistoryBattle;

import java.util.concurrent.ConcurrentHashMap;

public class InMemoryDatabaseHistoryBattle {
    private static InMemoryDatabaseHistoryBattle INSTANCE;
    private static final java.util.Map<String, HistoryBattle> IN_MEMORY_DATABASE = new ConcurrentHashMap<>();

    private InMemoryDatabaseHistoryBattle() {
    }

    public static synchronized InMemoryDatabaseHistoryBattle getInstance() {
        if (INSTANCE == null) {
            return new InMemoryDatabaseHistoryBattle();
        }
        return INSTANCE;
    }

    public boolean saveHistoryBattle(HistoryBattle historyBattle){
        if(IN_MEMORY_DATABASE.put("1", historyBattle) == null)
            return false;
        return true;
    }

    public HistoryBattle findHistory(String ID){
        return IN_MEMORY_DATABASE.get(ID);
    }


}
