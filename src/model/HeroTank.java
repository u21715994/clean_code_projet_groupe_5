package model;

import model.Hero;
import model.Rarity;

public class HeroTank extends Hero {
    private final Rarity rarity;
    public HeroTank(String name, Rarity rarity){
        this.name = name;
        this.lifePoint = 1000 + (1000/10) * rarity.getValue();
        this.experiencePoint = 0;
        this.power = 100 + (100/10) * rarity.getValue();
        this.armor = 20 + (20/10) * rarity.getValue();
        this.rarity = rarity;
        this.level = 1;
    }
}
