package domain.functional.service;

import domain.functional.model.Deck;
import domain.functional.model.Hero;
import domain.functional.model.HistoryBattle;
import domain.functional.model.Player;

import java.util.List;

public class AttackPlayerService {
    public static void attackPlayer(Player attacker, Player defender){
        Deck deckAttacker = ShowDeckPlayerService.showDeck(attacker);
        Hero hero = deckAttacker.getCards().get(0);
        List<Hero> heroOfPlayer = HeroFinderService.findHero(defender.getDeck(), hero.getLevel());
        Hero hero1 = heroOfPlayer.get(0);
        hero.attack(hero1);
        UpdatePlayerInDatabaseService.updatePlayer(defender.getID(), defender);
        HistoryBattle historyBattle = new HistoryBattle(attacker, defender);
        HistoryBattleRecordService.recordHistoryBattle(historyBattle);
    }
}
