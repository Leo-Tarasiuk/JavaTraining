package by.epam.javatraining.tarasiuk.lesson6.task4.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberLogicTest {

    @Test
    public void checkEven() {
        int a = 248;

        String expected = "even";

        assertEquals(expected, EvenNumberLogic.checkEven(a));
    }

    @Test
    public void checkUneven() {
        int a = 531;

        String expected = "uneven";

        assertEquals(expected, EvenNumberLogic.checkUneven(a));
    }
}