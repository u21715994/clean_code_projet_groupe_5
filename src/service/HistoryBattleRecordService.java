package service;

import database.InMemoryDatabaseHistoryBattle;
import model.HistoryBattle;

public class HistoryBattleRecordService {
    public InMemoryDatabaseHistoryBattle inMemoryDatabaseHistoryBattle;

    public boolean recordHistoryBattle(HistoryBattle historyBattle){
        return inMemoryDatabaseHistoryBattle.saveHistoryBattle(historyBattle);
    }
}
