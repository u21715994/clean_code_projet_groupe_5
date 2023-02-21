package domain.functional.service;

import domain.functional.model.Hero;
import domain.functional.model.HeroFactory;
import domain.functional.model.Rarity;
import domain.functional.model.Speciality;

public class HeroCreateService {
    public static Hero createHero(Speciality speciality, Rarity rarity, String name){
        return HeroFactory.createHero(speciality, rarity, name);
    }
}
