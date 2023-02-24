package domain.functional.service;

import domain.functional.model.Hero;

public class UpdateInfoHeroService {
    public static void updateInfoHeroService(Hero hero_attacker){
        if (hero_attacker.getExperiencePoint() % 5 == 0)
            hero_attacker = hero_attacker.levelUp();
    }
}
