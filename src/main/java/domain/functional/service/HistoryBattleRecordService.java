package domain.functional.service;

import database.InMemoryDatabaseHistoryBattle;
import domain.functional.model.HistoryBattle;

public class HistoryBattleRecordService {
    public static void recordHistoryBattle(HistoryBattle historyBattle){
        InMemoryDatabaseHistoryBattle.getInstance().saveHistoryBattle(historyBattle);
    }
}
