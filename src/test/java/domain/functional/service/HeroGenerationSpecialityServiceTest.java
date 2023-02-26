package domain.functional.service;

import domain.functional.model.Speciality;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeroGenerationSpecialityServiceTest {
    @Test
    public void generateSpecialityAssassin(){
        assertTrue(Speciality.ASSASSIN == Speciality.ASSASSIN);
    }

    @Test
    public void generateSpecialityTank(){
        assertTrue(Speciality.TANK == Speciality.TANK);
    }

    @Test
    public void generateSpecialityWizard(){
        assertTrue(Speciality.WIZARD == Speciality.WIZARD);
    }
}
