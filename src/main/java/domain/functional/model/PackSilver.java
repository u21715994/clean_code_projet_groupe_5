package domain.functional.model;

import domain.functional.service.HeroGenerationService;
import domain.functional.service.PlayerCreateService;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class PackSilver implements Pack{
    List<Hero> heroes;
    public PackSilver(){
        this.heroes = new ArrayList<Hero>();
        createPack();
    }

    @Override
    public void createPack(){
        for(int i = 0; i < 3; i++) {
            this.heroes.add(HeroGenerationService.generateHero());
        }
    }

    @Override
    public List<Hero> getHeroInPack() {
        return heroes;
    }
}
