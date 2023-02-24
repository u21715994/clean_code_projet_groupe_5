package domain.functional.model;

import domain.functional.service.HeroGenerationService;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class PackDiamond implements Pack{
    List<Hero> heroes;
    public PackDiamond(){
        heroes = new ArrayList<Hero>(5);
        createPack();
    }

    @Override
    public void createPack(){
        for(int i = 0; i < 5; i++) {
            this.heroes.add(HeroGenerationService.generateHero());
        }
    }

    @Override
    public List<Hero> getHeroInPack() {
        return heroes;
    }
}
