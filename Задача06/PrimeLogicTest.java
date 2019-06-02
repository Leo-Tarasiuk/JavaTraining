package by.epam.javatraining.tarasiuk.lesson6.task5.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeLogicTest {

    @Test
    public void testcheckPrimeNumber() {
        int a = 17;

        boolean expected = true;

        assertTrue(expected == PrimeLogic.checkPrimeNumber(a));
    }
}