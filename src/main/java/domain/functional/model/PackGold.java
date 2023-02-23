package domain.functional.model;

import domain.functional.service.HeroGenerationService;
import domain.functional.service.PlayerCreateService;

import java.util.ArrayList;
import java.util.Random;

public class PackGold extends Pack{
    public PackGold(){
        super.tokensRequired = 2;
        heroes = new ArrayList<Hero>(5);
        createPack();
    }

    public void createPack(){
        for(int i = 0; i < 5; i++) {
            this.heroes.add(HeroGenerationService.generateHero());
        }
    }

    public Player addHeroesToDeck(Player player, int tokenRequired){
        return PlayerCreateService.createPlayer(player, tokenRequired, heroes);
    }
}
