package by.epam.javatraining.tarasiuk.lesson6.task2.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumericSequenceLogicTest {

    @Test
    public void testcheckIncreaseSequence() {
        int a = 123456;

        boolean expected = true;

        assertTrue(expected == NumericSequenceLogic.checkIncreaseSequence(a));
    }

    @Test
    public void testcheckDecreaseSequence() {
        int a = 654321;

        boolean expected = true;

        assertTrue(expected == NumericSequenceLogic.checkDecreaseSequence(a));
    }
}
