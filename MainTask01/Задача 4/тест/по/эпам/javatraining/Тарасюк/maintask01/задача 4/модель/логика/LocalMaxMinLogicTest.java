package by.epam.javatraining.tarasiuk.maintask01.task4.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class LocalMaxMinLogicTest {

    @Test
    public void findLocalMaxMin() {
        double[] array = {1, 2, 3, 2, 4, 4};

        int expected = 2;

        assertEquals(expected, LocalMaxMinLogic.findLocalMaxMin(array));
    }
}
