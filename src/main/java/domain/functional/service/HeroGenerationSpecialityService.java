package domain.functional.service;

import domain.functional.model.Speciality;

import java.util.Random;

public class HeroGenerationSpecialityService {
    public static Speciality generateSpeciality(){
        Random random = new Random();
        int heroRarity = random.nextInt(1, 4);
        boolean probablyAssassin = heroRarity == 1;
        boolean probablyTank = heroRarity == 2;
        if(probablyAssassin)
            return Speciality.ASSASSIN;
        else if(probablyTank)
            return Speciality.TANK;
        return Speciality.WIZARD;
    }
}
