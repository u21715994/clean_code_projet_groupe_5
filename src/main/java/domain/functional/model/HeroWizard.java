package domain.functional.model;

public class HeroWizard extends Hero {
    public HeroWizard(String name, Rarity rarity){
        this.name = name;
        this.lifePoint = 750 + (750/10) * rarity.getValue();
        this.experiencePoint = 0;
        this.power = 150 + (150/10) * rarity.getValue();
        this.armor = 10 + (10/10) * rarity.getValue();
        this.rarity = rarity;
        this.level = 1;
    }

    public void attack(Hero hero) {
        System.out.println(this.power);
        System.out.println(hero.armor);
        hero.lifePoint = hero.lifePoint - this.power;
        hero.armor = this.power - hero.armor;
    }

    public void attackAssassin(Hero hero) {
        hero.lifePoint = hero.lifePoint - (this.power+25);
        hero.armor = (this.power+25) - hero.armor;
    }
}
