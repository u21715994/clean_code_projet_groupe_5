package domain.functional.service;

import domain.functional.model.Deck;
import domain.functional.model.Hero;
import domain.functional.model.Player;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SelectHeroFirstInDeckServiceTest{
    @Test
    public void selectHero(Player attacker, Player defender) {
        Deck deckAttacker = ShowDeckPlayerService.showDeck(attacker);
        Hero hero_attacker = deckAttacker.getCards().get(0);
        List<Hero> heroOfPlayer = HeroFinderService.findHero(defender.getDeck(), hero_attacker.getLevel());
        Hero hero_defender = heroOfPlayer.get(0);
        List<Hero> heroesInvolved = new ArrayList<>();
        heroesInvolved.add(hero_attacker);
        heroesInvolved.add(hero_defender);
    }
}
