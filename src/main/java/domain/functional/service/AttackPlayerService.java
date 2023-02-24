package domain.functional.service;

import domain.functional.model.Hero;

public class AttackPlayerService {
    public static void attackPlayer(Hero hero_attacker, Hero hero_defender){
        hero_attacker.attack(hero_defender);
    }
}
