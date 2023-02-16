package model;

import model.Hero;
import model.Rarity;

public class HeroWizard extends Hero {
    private final Rarity rarity;
    public HeroWizard(String name, Rarity rarity){
        this.name = name;
        this.lifePoint = 750 + (750/10) * rarity.getValue();
        this.experiencePoint = 0;
        this.power = 150 + (150/10) * rarity.getValue();
        this.armor = 10 + (10/10) * rarity.getValue();
        this.rarity = rarity;
        this.level = 1;
    }
}
