package domain.functional.service;

import domain.functional.model.Hero;
import domain.functional.model.Player;
import org.junit.jupiter.api.Test;

public class UpdateInformationPlayerDefenderTest {
    @Test
    public void informationPlayerDefender(Player defender, Hero hero_defender, int index){
        defender.getDeck().getCards().set(index, hero_defender);
    }
}
