package domain.functional.service;

import domain.functional.model.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class PlayerWinBattleTest {
    @Test
    public void playerWinBattle(){
        Player player = new Player(GenerateNameHeroService.generateName());
        Player player2 = player;
        player = player.playerWinBattle(player, 1, 0);
        player = player.playerWinBattle(player, 0, 1);
        assertFalse(player2.equals(player));
    }
}
