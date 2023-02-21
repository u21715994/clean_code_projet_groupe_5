package domain.functional.service;

import database.InMemoryDatabaseHistoryBattle;
import domain.functional.model.HistoryBattle;

public class HistoryBattleFindService {
    public InMemoryDatabaseHistoryBattle inMemoryDatabaseHistoryBattle;

    public HistoryBattle findHistoryBattle(String ID){
        return inMemoryDatabaseHistoryBattle.findHistory(ID);
    }
}
