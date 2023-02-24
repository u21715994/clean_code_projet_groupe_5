package domain.functional.model;

public interface Hero {
    int getLifePoint();
    int getArmor();
    int getLevel();
    Hero setLifePoint(int lifePoint);

    Hero levelUp();

    void attack(Hero hero);

    Hero battleWin();
    boolean isDead();

    int getExperiencePoint();
}
