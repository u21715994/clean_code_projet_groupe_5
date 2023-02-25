package domain.functional.service;

import domain.functional.model.Hero;

public class DefendHeroPlayerService {
    public static Hero defendPlayer(Hero hero_attacker, Hero hero_defender){
        hero_defender = hero_defender.defend(hero_attacker);
        return hero_defender;
    }
}
