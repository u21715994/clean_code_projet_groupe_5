package domain.functional.service;

import domain.functional.model.Hero;
import domain.functional.model.Player;

public class UpdateHeroInformation {
    public static void updateHeroInformation(Hero hero_attacker, Hero hero_defender, Player defender){
        if(hero_defender.isDead()) {
            hero_attacker = hero_attacker.battleWin();
            UpdateInfoHeroService.updateInfoHeroService(hero_attacker);
            ShowDeckPlayerService.showDeck(defender).getCards().remove(hero_defender);
        }
    }
}
