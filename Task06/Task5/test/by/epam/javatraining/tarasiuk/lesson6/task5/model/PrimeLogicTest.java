package by.epam.javatraining.tarasiuk.lesson6.task5.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeLogicTest {

    @Test
    public void checkPrimeNumber() {
        int a = 17;

        assertTrue(PrimeLogic.checkPrimeNumber(a));
    }
}