package domain.functional.service;

import domain.functional.model.Deck;
import static org.mockito.Mockito.when;

import domain.functional.model.Hero;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class HeroFinderServiceTest {
    @InjectMocks
    private Deck deck;
    @Mock
    private List<Hero> heroes;

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void findHeroTest(int level){
        when(deck.getCards()).thenReturn(heroes);
        assertTrue(deck.getCards().size() > 0);
        assertTrue(deck == null);
        assertTrue(level > 0);
        assertTrue(deck.getCards().stream().filter(hero-> hero.getLevel() >= level) != null);
    }
}
