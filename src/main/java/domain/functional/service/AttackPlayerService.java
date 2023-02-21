package domain.functional.service;

import domain.functional.model.Hero;
import domain.functional.model.Player;

import java.util.List;

public class AttackPlayerService {
    public static void attackPlayer(Hero hero, Player player){
        List<Hero> heroOfPlayer = HeroFinderService.findHero(player.getDeck(), hero.getLevel());
        Hero hero1 = heroOfPlayer.get(0);
        hero.attack(hero1);
        UpdatePlayerInDatabaseService.updatePlayer(player.getID(), player);
    }
}
