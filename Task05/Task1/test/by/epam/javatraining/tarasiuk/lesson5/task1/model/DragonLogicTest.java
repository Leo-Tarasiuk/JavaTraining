package by.epam.javatraining.tarasiuk.lesson5.task1.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class DragonLogicTest {

    @Test
    public void calcDragonHeads() {
        int a = 201;

        int expected = 605;

        assertEquals(expected, DragonLogic.calcDragonHeads(a));
    }

    @Test
    public void calcDragonEyes() {
        int a = 201;

        int expected = 1210;

        assertEquals(expected, DragonLogic.calcDragonEyes(a));
    }
}
