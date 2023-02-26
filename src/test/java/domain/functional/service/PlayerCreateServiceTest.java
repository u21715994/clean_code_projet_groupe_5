package domain.functional.service;

import domain.functional.model.Hero;
import domain.functional.model.Player;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerCreateServiceTest {
    @Test
    public void createPlayerTest(){
        String name = GenerateNameHeroService.generateName();
        assertTrue(new Player(name) instanceof Player);
    }

    @ParameterizedTest
    @ValueSource(ints={1,2,3})
    public void createPlayerTest(int tokenRequired){
        List<Hero> heroesInDeck = new ArrayList<>();
        String name = GenerateNameHeroService.generateName();
        Player player = new Player(name);
        assertTrue(new Player(player, tokenRequired,heroesInDeck) instanceof Player);
    }
}
