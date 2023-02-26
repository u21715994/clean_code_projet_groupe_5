package domain.functional.service;

import domain.functional.model.Hero;
import domain.functional.model.Rarity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeroGenerationServiceTest {
    @Test
    public void generateHeroTestLegendary(){
        Hero hero = HeroCreateService.createHero(HeroGenerationSpecialityService.generateSpeciality(), Rarity.LEGENDARY, GenerateNameHeroService.generateName());
        assertTrue(hero instanceof Hero);
    }

    @Test
    public void generateHeroTestRare(){
        Hero hero = HeroCreateService.createHero(HeroGenerationSpecialityService.generateSpeciality(), Rarity.RARE, GenerateNameHeroService.generateName());
        assertTrue(hero instanceof Hero);
    }

    @Test
    public void generateHeroTestCommon(){
        Hero hero = HeroCreateService.createHero(HeroGenerationSpecialityService.generateSpeciality(), Rarity.COMMON, GenerateNameHeroService.generateName());
        assertTrue(hero instanceof Hero);
    }
}
