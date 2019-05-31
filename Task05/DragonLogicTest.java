package by.epam.javatraining.tarasiuk.lesson5.task1.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class DragonLogicTest {

    @Test
    public void calcDragonHeads() {
        int a = 201;

        int expected = 604;

        assertEquals(expected, DragonLogic.calcDragonHeads(a));
    }

    @Test
    public void calcDragonEyes() {
        int a = 600;

        int expected = 2202;

        assertEquals(expected, DragonLogic.calcDragonEyes(a));
    }

    @Test
    public void checkValidValue() {
        int a = 5;
        assertTrue(a >= 0);
    }
}