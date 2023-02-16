package service;

import database.InMemoryDatabaseHistoryBattle;
import model.HistoryBattle;

public class HistoryBattleFindService {
    public InMemoryDatabaseHistoryBattle inMemoryDatabaseHistoryBattle;

    public HistoryBattle findHistoryBattle(String ID){
        return inMemoryDatabaseHistoryBattle.findHistory(ID);
    }
}
