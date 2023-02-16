package model;

import java.util.ArrayList;
import java.util.Random;

public class PackGold extends Pack{
    public PackGold(){
        super.tokensRequired = 2;
        heroes = new ArrayList<>(5);
        pack();
    }

    public void generateHero(){
        Random random = new Random();
        int heroRarity = random.nextInt(1, 101);
        boolean probablyLegendary = heroRarity <= 15;
        boolean probablyRare = 15 < heroRarity && heroRarity <= 50;
        if(probablyLegendary)
            gH(Rarity.LEGENDARY);
        else if(probablyRare)
            gH(Rarity.RARE);
        else
            gH(Rarity.COMMON);
    }

    public void pack(){
        for(int i = 0; i < heroes.size(); i++) {
            generateHero();
        }
    }

    public void gH(Rarity rarity){
        heroes.add(HeroFactory.createHero(generateSpeciality(), rarity, "r"));
    }

    public Speciality generateSpeciality(){
        Random random = new Random();
        int heroRarity = random.nextInt(1, 4);
        boolean probablyAssassin = heroRarity == 1;
        boolean probablyTank = heroRarity == 2;
        if(probablyAssassin)
            return Speciality.ASSASSIN;
        else if(probablyTank)
            return Speciality.TANK;
        return Speciality.WIZARD;
    }
}
