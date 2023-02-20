package model;

import model.Hero;
import model.Rarity;

public class HeroAssassin extends Hero {
    private final Rarity rarity;
    public HeroAssassin(String name, Rarity rarity){
        this.name = name;
        this.lifePoint = 800 + (800/10) * rarity.getValue();
        this.experiencePoint = 0;
        this.power = 200 + (200/10) * rarity.getValue();
        this.armor = 5 + (5/10) * rarity.getValue();
        this.rarity = rarity;
        this.level = 1;
    }

    public void attackHero(){

    }

    public void levelUp(){
        this.level++;
        this.lifePoint = this.lifePoint + this.lifePoint/10;
        this.power = this.power + this.power/10;
        this.armor = this.armor + this.armor/10;
    }

    public void winBattle(){
        this.experiencePoint++;
    }
}
