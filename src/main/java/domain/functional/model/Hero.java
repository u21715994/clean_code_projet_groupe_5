package domain.functional.model;

public class Hero {
    String name;
    int lifePoint;
    int experiencePoint;
    int power;
    int armor;
    String rarity;
    int level;

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", lifePoint=" + lifePoint +
                ", experiencePoint=" + experiencePoint +
                ", power=" + power +
                ", armor=" + armor +
                ", rarity='" + rarity + '\'' +
                ", level=" + level +
                '}';
    }
}
