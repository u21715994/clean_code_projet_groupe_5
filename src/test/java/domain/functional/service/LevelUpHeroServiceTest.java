package domain.functional.service;

import domain.functional.model.Hero;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class LevelUpHeroServiceTest {
    @Mock
    Hero hero_attacker;
    @Test
    public void levelHeroUpTest(){
        Hero hero = hero_attacker;
        when(hero_attacker.levelUp()).thenReturn(hero_attacker.levelUp());
        hero_attacker = hero_attacker.levelUp();
        assertTrue(hero_attacker.equals(hero));
    }
}
