package service;

import model.Hero;
import model.HeroFactory;
import model.Rarity;

import java.util.Random;

import static service.HeroGenerationSpecialityService.generateSpeciality;

public class HeroGenerationService {
    public static Hero generateHero(){
        Random random = new Random();
        int heroRarity = random.nextInt(1, 101);
        boolean probablyLegendary = heroRarity <= 5;
        boolean probablyRare = 5 < heroRarity && heroRarity <= 25;
        if(probablyLegendary)
            return HeroCreateService.createHero(generateSpeciality(), Rarity.LEGENDARY, "r");
        else if(probablyRare)
            return HeroCreateService.createHero(generateSpeciality(), Rarity.RARE, "r");
        return HeroCreateService.createHero(generateSpeciality(), Rarity.COMMON, "r");
    }
}
