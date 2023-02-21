package domain.functional.service;

import database.InMemoryDatabaseHistoryBattle;
import domain.functional.model.HistoryBattle;

public class HistoryBattleRecordService {
    public InMemoryDatabaseHistoryBattle inMemoryDatabaseHistoryBattle;

    public boolean recordHistoryBattle(HistoryBattle historyBattle){
        return inMemoryDatabaseHistoryBattle.saveHistoryBattle(historyBattle);
    }
}
