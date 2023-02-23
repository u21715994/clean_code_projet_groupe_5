package domain.functional.model;

import domain.functional.service.HeroGenerationService;
import domain.functional.service.PlayerCreateService;

import java.util.ArrayList;

public class PackSilver extends Pack{
    public PackSilver(){
        super.tokensRequired = 1;
        this.heroes = new ArrayList<Hero>();
        createPack();
    }

    public void createPack(){
        for(int i = 0; i < 3; i++) {
            this.heroes.add(HeroGenerationService.generateHero());
        }
    }

    public Player addHeroesToDeck(Player player, int tokenRequired){
        return PlayerCreateService.createPlayer(player, tokenRequired, heroes);
    }
}
