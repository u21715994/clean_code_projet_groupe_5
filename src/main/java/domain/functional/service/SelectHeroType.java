package domain.functional.service;

import domain.functional.model.Hero;
import domain.functional.model.Player;

import java.util.List;

public interface SelectHeroType {
    List<Hero> selectHero(Player attacker, Player defender);
}
