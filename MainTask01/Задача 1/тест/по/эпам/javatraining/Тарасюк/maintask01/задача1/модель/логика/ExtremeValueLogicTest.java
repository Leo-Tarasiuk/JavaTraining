package by.epam.javatraining.tarasiuk.maintask01.task1.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExtremeValueLogicTest {

    @Test
    public void findMax() {
        double[] array = {3, 5, 12, 9, 27, 1};

        int expected = 27;

        assertEquals(expected, (int)ExtremeValueLogic.findMax(array));
    }

    @Test
    public void findMin() {
        double[] array = {3, 5, 12, 9, 27, 1};

        int expected = 1;

        assertEquals(expected, (int)ExtremeValueLogic.findMin(array));
    }
}