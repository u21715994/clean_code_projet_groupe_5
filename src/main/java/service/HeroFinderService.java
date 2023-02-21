package service;

import model.Deck;
import model.Hero;

import java.util.List;

public class HeroFinderService {
    public static List<Hero> findHero(Deck deck, int level){
        if(level <= 0)
            throw new IllegalArgumentException("Vous ne pouvez pas rechercher un hero avec un niveau inférieur ou égale à 0");
        return deck.getCards().stream().filter(hero-> hero.getLevel() >= level).toList();
    }
}
