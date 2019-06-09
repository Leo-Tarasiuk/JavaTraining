package by.epam.javatraining.tarasiuk.maintask01.task7.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySortingLogicTest {

    @Test
    public void bubbleSort() {
        int[] array = {12, 13, 41, 23, 4, 10};

        int[] expected = {4, 10, 12, 13, 23, 41};

        ArraySortingLogic.bubbleSort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void insertSort() {
        int[] array = {12, 13, 41, 23, 4, 10};

        int[] expected = {4, 10, 12, 13, 23, 41};

        assertArrayEquals(expected,ArraySortingLogic.insertSort(array));
    }

    @Test
    public void selectSort() {
        int[] array = {12, 13, 41, 23, 4, 10};

        int[] expected = {4, 10, 12, 13, 23, 41};

        ArraySortingLogic.selectSort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void mergeSort() {
        int[] array = {12, 13, 4, 10};

        int[] expected = {4, 10, 12, 13};

        ArraySortingLogic.mergeSort(array, array.length);

        assertArrayEquals(expected, array);
    }

    @Test
    public void qSort() {
        int[] array = {12, 13, 41, 23, 4, 10};

        int[] expected = {4, 10, 12, 13, 23, 41};

        ArraySortingLogic.qSort(array);

        assertArrayEquals(expected, array);
    }
}