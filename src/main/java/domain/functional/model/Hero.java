package domain.functional.model;

public interface Hero {
    int getLifePoint();
    int getArmor();
    int getLevel();
    int getPower();
    Hero setLifePoint(int lifePoint);

    Hero levelUp();

    Hero defend(Hero hero);

    Hero battleWin();
    boolean isDead();

    int getExperiencePoint();
}
