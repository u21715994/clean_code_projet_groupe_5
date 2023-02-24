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

    public HeroTank(String name, int lifePoint, int experiencePoint, int power, int armor,
                        Rarity rarity, int level){
        this.name = name;
        this.lifePoint = lifePoint;
        this.experiencePoint = experiencePoint;
        this.power = power;
        this.armor = armor;
        this.rarity = rarity;
        this.level = level;
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
    public int getExperiencePoint() {
        return experiencePoint;
    }

    @Override
    public Hero setLifePoint(int lifePoint) {
        return new HeroAssassin(this.name, this.lifePoint + lifePoint, this.experiencePoint,
                this.power, this.armor, this.rarity, this.level
        );
    }

    @Override
    public Hero levelUp(){
        return new HeroAssassin(this.name, this.lifePoint + this.lifePoint / 10, this.experiencePoint,
                this.power + this.power / 10, this.armor + this.armor / 10, this.rarity, this.level+1
        );
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                "speciality=Tank"+'\''+
                ", lifePoint=" + lifePoint +
                ", experiencePoint=" + experiencePoint +
                ", power=" + power +
                ", armor=" + armor +
                ", rarity='" + rarity + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public Hero battleWin(){
        return new HeroTank(this.name, this.lifePoint + this.lifePoint, this.experiencePoint+1,
                this.power, this.armor, this.rarity, this.level
        );
    }

    @Override
    public void attack(Hero hero) {
        hero.setLifePoint(-this.power);
        hero.setLifePoint(-(this.power - hero.getArmor()));
    }

    @Override
    public boolean isDead() {
        return lifePoint <= 0;
    }
}
