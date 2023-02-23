package domain.functional.model;

public interface Hero {
    int getLifePoint();
    int getArmor();
    int getLevel();
    void setLifePoint(int lifePoint);
    void setArmor(int armor);

    void levelUp();

    void attack(Hero hero);

    void battleWin();
    boolean checkIfHeroIsDead();
}
