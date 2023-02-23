package domain.functional.model;

public class HeroTank implements Hero {
    String name;
    int lifePoint;
    int experiencePoint;
    int power;
    int armor;
    Rarity rarity;
    int level;
    public HeroTank(String name, Rarity rarity){
        this.name = name;
        this.lifePoint = 1000 + (1000/10) * rarity.getValue();
        this.experiencePoint = 0;
        this.power = 100 + (100/10) * rarity.getValue();
        this.armor = 20 + (20/10) * rarity.getValue();
        this.rarity = rarity;
        this.level = 1;
    }

    @Override
    public int getLifePoint() {
        return lifePoint;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLifePoint(int lifePoint) {
        this.lifePoint = this.lifePoint + lifePoint;
    }

    @Override
    public void setArmor(int armor) {
        this.armor = this.armor + armor;
    }

    @Override
    public void levelUp(){
        if(this.experiencePoint%5 == 0) {
            this.level++;
            this.lifePoint = this.lifePoint + this.lifePoint / 10;
            this.power = this.power + this.power / 10;
            this.armor = this.armor + this.armor / 10;
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                "speciality' Tank "+'\''+
                ", lifePoint=" + lifePoint +
                ", experiencePoint=" + experiencePoint +
                ", power=" + power +
                ", armor=" + armor +
                ", rarity='" + rarity + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public void battleWin(){
        this.experiencePoint++;
    }

    @Override
    public void attack(Hero hero) {
        hero.setLifePoint(-this.power);
        hero.setLifePoint(-(this.power - hero.getArmor()));
    }

    @Override
    public boolean checkIfHeroIsDead() {
        return lifePoint <= 0;
    }
}
