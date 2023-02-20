package service;

import model.Hero;
import model.HeroFactory;
import model.Rarity;
import model.Speciality;

public class HeroCreateService {
    public static Hero createHero(Speciality speciality, Rarity rarity, String name){
        return HeroFactory.createHero(speciality, rarity, name);
    }
}
