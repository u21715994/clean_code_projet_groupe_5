package model;

import service.PlayerCreateService;

import java.util.ArrayList;

import static service.HeroGenerationService.generateHero;

public class PackSilver extends Pack{
    public PackSilver(){
        super.tokensRequired = 1;
        this.heroes = new ArrayList<Hero>();
        pack();
    }

    public void pack(){
        for(int i = 0; i < 3; i++) {
            this.heroes.add(generateHero());
        }
    }

    public Player addHeroesToDeck(Player player){
        return PlayerCreateService.createPlayer(player, heroes);
    }
}
