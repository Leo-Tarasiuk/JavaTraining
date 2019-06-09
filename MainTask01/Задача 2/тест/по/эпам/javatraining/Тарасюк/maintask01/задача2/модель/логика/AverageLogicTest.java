package by.epam.javatraining.tarasiuk.maintask01.task2.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class AverageLogicTest {

    @Test
    public void calcAverage() {
        double[] array = {3, 5, 12, 9, 27, 1};

        int expected = 9;

        assertEquals(expected, (int)AverageLogic.calcAverage(array));
    }

    @Test
    public void calcGeometricMean() {
        double[] array = {3, 5, 12, 9, 27, 1};

        int expected = 5;

        assertEquals(expected, (int)AverageLogic.calcGeometricMean(array));
    }
}