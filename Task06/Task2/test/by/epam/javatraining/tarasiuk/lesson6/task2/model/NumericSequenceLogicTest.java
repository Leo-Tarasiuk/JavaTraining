package by.epam.javatraining.tarasiuk.lesson6.task2.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumericSequenceLogicTest {

    @Test
    public void checkIncreaseSequence() {
        int a = 123456;

        assertTrue(NumericSequenceLogic.checkIncreaseSequence(a));
    }

    @Test
    public void checkDecreaseSequence() {
        int a = 654321;

        assertTrue(NumericSequenceLogic.checkDecreaseSequence(a));
    }
}