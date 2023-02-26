package domain.functional.service;

import domain.functional.model.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class PlayerOpenPackServiceTest {

    @ParameterizedTest
    @ValueSource(ints={1})
    public void openPackSilverTest(int tokenRequired){
        Player player = new Player(GenerateNameHeroService.generateName());
        Player player_test = new AddHeroPackSilver(new PackSilver()).addHeroesToDeck(player, tokenRequired);
        UpdatePlayerInDatabaseService.updatePlayer(player.getID(), player);
        assertFalse(player_test.equals(player));
    }

    @ParameterizedTest
    @ValueSource(ints={2})
    public void openPackDiamondTest(int tokenRequired){
        Player player = new Player(GenerateNameHeroService.generateName());
        Player player_test = new AddHeroPackSilver(new PackSilver()).addHeroesToDeck(player, tokenRequired);
        UpdatePlayerInDatabaseService.updatePlayer(player.getID(), player);
        assertFalse(player_test.equals(player));
    }
}
