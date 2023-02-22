package domain.functional.model;

public class HeroAssassin extends Hero {
    public HeroAssassin(String name, Rarity rarity){
        this.name = name;
        this.lifePoint = 800 + (800/10) * rarity.getValue();
        this.experiencePoint = 0;
        this.power = 200 + (200/10) * rarity.getValue();
        this.armor = 5 + (5/10) * rarity.getValue();
        this.rarity = rarity;
        this.level = 1;
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

    public void attack(Hero hero) {
        System.out.println(this.power);
        System.out.println(hero.armor);
        hero.lifePoint = hero.lifePoint - this.power;
        hero.armor = this.power - hero.armor;
    }

    public void attackTank(Hero hero) {
        hero.lifePoint = hero.lifePoint - (this.power+30);
        hero.armor = ((this.power+30) - hero.armor);
    }
}
