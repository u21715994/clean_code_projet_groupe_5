package domain.functional.model;

public class HeroTank extends Hero {
    public HeroTank(String name, Rarity rarity){
        this.name = name;
        this.lifePoint = 1000 + (1000/10) * rarity.getValue();
        this.experiencePoint = 0;
        this.power = 100 + (100/10) * rarity.getValue();
        this.armor = 20 + (20/10) * rarity.getValue();
        this.rarity = rarity;
        this.level = 1;
    }

    public void attack(Hero hero) {
        hero.power = hero.power - this.power;
        hero.armor = this.power - this.armor;
    }

    public void attackWizard(Hero hero) {
        hero.power = hero.power - (this.power+20);
        hero.armor = (this.power+20) - this.armor;
    }
}
