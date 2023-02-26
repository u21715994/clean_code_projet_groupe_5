package domain.functional.service;

import domain.functional.model.Hero;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

public class DefendHeroPlayerServiceTest {
    @InjectMocks
    Hero hero;
    Hero hero1;

    @Test
    public void defendPlayerTest(){
        Hero hero_test = hero1;
        hero.defend(hero1);
        assertFalse(hero_test.equals(hero));
    }
}
