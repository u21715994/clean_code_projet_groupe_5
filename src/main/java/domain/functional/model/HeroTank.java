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
        hero.lifePoint = hero.lifePoint - this.power;
        System.out.println(this.power);
        System.out.println(hero.armor);
        hero.armor = this.power - hero.armor;
    }

    public void attackWizard(Hero hero) {
        hero.lifePoint = hero.lifePoint - (this.power+20);
        hero.armor = (this.power+20) - hero.armor;
    }
}
