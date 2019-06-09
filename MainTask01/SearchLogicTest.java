package by.epam.javatraining.tarasiuk.maintask01.task5.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchLogicTest {

    @Test
    public void linearSearch() {
        double[] array = {3, 5, 12, 9, 27, 1};
        double elementToSearch = 12;

        int expected = 2;

        assertEquals(expected, SearchLogic.linearSearch(array, elementToSearch));
    }

    @Test
    public void binarySearch() {
        double[] array = {3, 5, 12, 9, 27, 1};
        double elementToSearch = 27;

        int expected = 4;

        assertEquals(expected, SearchLogic.binarySearch(array,elementToSearch));
    }
}