package by.epam.javatraining.tarasiuk.lesson6.task3.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialLogicTest {

    @Test
    public void testcalcFact() {
        int a = 5;

        int expected = 120;

        assertEquals(expected, FactorialLogic.calcFact(a));
    }
}
