package by.epam.javatraining.tarasiuk.maintask01.task6.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLogicTest {

    @Test
    public void reverseArray() {
        int[] array = {3, 5, 12, 9, 27, 1};

        int[] expected = {1, 27, 9, 12, 5, 3};

        ReverseLogic.reverseArray(array);

        assertArrayEquals(expected, array);
    }
}