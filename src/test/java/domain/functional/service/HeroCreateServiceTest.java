package domain.functional.service;

import domain.functional.model.Hero;
import domain.functional.model.HeroFactory;
import domain.functional.model.Rarity;
import domain.functional.model.Speciality;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeroCreateServiceTest {
    @ParameterizedTest
    @EnumSource(value = Rarity.class, names = {"COMMON", "RARE", "LEGENDARY"})
    public void createHero(Rarity rarity){
        String name = GenerateNameHeroService.generateName();
        Speciality speciality = HeroGenerationSpecialityService.generateSpeciality();
        Hero hero = HeroFactory.createHero(speciality, rarity, name);
        assertTrue(hero instanceof Hero);
    }
}
