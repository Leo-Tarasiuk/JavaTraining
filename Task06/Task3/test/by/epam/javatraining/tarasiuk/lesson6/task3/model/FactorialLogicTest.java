package by.epam.javatraining.tarasiuk.lesson6.task3.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialLogicTest {

    @Test
    public void calcFact() {
        int a = 3;

        int expected = 6;

        assertEquals(expected, FactorialLogic.calcFact(a));
    }
}