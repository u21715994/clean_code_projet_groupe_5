package domain.functional.service;

import domain.functional.model.Hero;
import domain.functional.model.Player;

public class UpdateInformationPlayerDefender {
    public static void informationPlayerDefender(Player defender, Hero hero_defender, int index){
        defender.getDeck().getCards().set(index, hero_defender);
    }
}
