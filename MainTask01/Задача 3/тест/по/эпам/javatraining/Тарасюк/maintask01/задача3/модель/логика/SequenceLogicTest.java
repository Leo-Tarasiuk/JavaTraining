package by.epam.javatraining.tarasiuk.maintask01.task3.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceLogicTest {

    @Test
    public void checkSequence() {
        double[] array = {51, 23, 12, 4};

        assertTrue(SequenceLogic.checkSequence(array));
    }
}