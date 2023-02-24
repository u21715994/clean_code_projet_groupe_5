package domain.functional.service;

import domain.functional.model.Deck;
import domain.functional.model.Hero;
import domain.functional.model.HistoryBattle;
import domain.functional.model.Player;

import java.util.List;

public class AttackPlayerService {
    public static void attackPlayer(Player attacker, Player defender){
        Deck deckAttacker = ShowDeckPlayerService.showDeck(attacker);
        Hero hero_attacker = deckAttacker.getCards().get(0);
        List<Hero> heroOfPlayer = HeroFinderService.findHero(defender.getDeck(), hero_attacker.getLevel());
        Hero hero_defender = heroOfPlayer.get(0);
        hero_attacker.attack(hero_defender);
        if(hero_defender.isDead()) {
            hero_attacker = hero_attacker.battleWin();
            UpdateInfoHeroService.updateInfoHeroService(hero_attacker);
            ShowDeckPlayerService.showDeck(defender).getCards().remove(hero_defender);
        }
        UpdatePlayerInDatabaseService.updatePlayer(defender.getID(), defender);
        HistoryBattle historyBattle = new HistoryBattle(attacker, defender);
        HistoryBattleRecordService.recordHistoryBattle(historyBattle);
    }
}
