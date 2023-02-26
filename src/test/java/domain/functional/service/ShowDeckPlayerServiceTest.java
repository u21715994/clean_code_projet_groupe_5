package domain.functional.service;

import domain.functional.model.Deck;
import domain.functional.model.Player;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class ShowDeckPlayerServiceTest {
    @Test
    public void showDeckTest(){
        Player player = new Player(GenerateNameHeroService.generateName());
        assertTrue(player.getDeck() instanceof Deck);
    }
}
