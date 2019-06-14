package by.epam.javatraining.tarasiuk.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorTest {

    @Test
    public void findMax() {
        double[] array3 = new double[0];
        int expected3 = 0;
        assertEquals(expected3, (int) Vector.findMax(array3));

        double[] array1 = {3, 5, 12, 9, 27, 1};
        int expected1 = 27;
        assertEquals(expected1, (int) Vector.findMax(array1));

        double[] array2 = {3, 5, 36, 9, 27, 1};
        int expected2 = 36;
        assertEquals(expected2, (int) Vector.findMax(array2));
    }

    @Test
    public void findMin() {
        double[] array3 = new double[0];
        int expected3 = 0;
        assertEquals(expected3, (int) Vector.findMin(array3));

        double[] array1 = {3, 5, 12, 9, 27, 1};
        int expected1 = 1;
        assertEquals(expected1, (int) Vector.findMin(array1));

        double[] array2 = {3, 5, 36, 9, 27, 10};
        int expected2 = 3;
        assertEquals(expected2, (int) Vector.findMin(array2));
    }

    @Test
    public void calcAverage() {
        double[] array2 = new double[0];
        int expected2 = 0;
        assertEquals(expected2, (int) Vector.calcAverage(array2));

        double[] array1 = {3, 5, 12, 9, 27, 1};
        int expected1 = 9;
        assertEquals(expected1, (int) Vector.calcAverage(array1));
    }

    @Test
    public void calcGeometricMean() {
        double[] array2 = new double[0];
        int expected2 = 0;
        assertEquals(expected2, (int) Vector.calcGeometricMean(array2));

        double[] array1 = {3, 5, 12, 9, 27, 1};
        int expected1 = 5;
        assertEquals(expected1, (int) Vector.calcGeometricMean(array1));

        double[] array3 = {3, 5, 12, 9, 27, -8};
        int expected3 = 0;
        assertEquals(expected3, (int) Vector.calcGeometricMean(array3));
    }

    @Test
    public void linearSearch() {
        double[] array1 = new double[0];
        double elementToSearch1 = 3;
        int expected1 = -1;
        assertEquals(expected1, Vector.linearSearch(elementToSearch1, array1));

        double[] array2 = {3, 5, 12, 9, 27, 1};
        double elementToSearch2 = 12;
        int expected2 = 2;
        assertEquals(expected2, Vector.linearSearch(elementToSearch2, array2));

        double[] array3 = {3, 5, 12, 9, 27, 1};
        double elementToSearch3 = 27;
        int expected3 = 4;
        assertEquals(expected3, Vector.linearSearch(elementToSearch3, array3));
    }

    @Test
    public void binarySearch() {
        int[] array1 = new int[0];
        int elementToSearch1 = 3;
        int expected1 = -1;
        assertEquals(expected1, Vector.binarySearch(elementToSearch1, array1));

        int[] array2 = {3, 5, 12, 9, 27, 1};
        int elementToSearch2 = 12;
        int expected2 = 4;
        assertEquals(expected2, Vector.binarySearch(elementToSearch2, array2));

        int[] array3 = {3, 5, 12, 9, 27, 1};
        int elementToSearch3 = 27;
        int expected3 = 5;
        assertEquals(expected3, Vector.binarySearch(elementToSearch3, array3));
    }

    @Test
    public void reverseArray() {
        int[] array1 = new int[0];
        int[] expected1 = array1;
        Vector.reverseArray(array1);
        assertEquals(expected1, array1);

        int[] array2 = {3, 5, 12, 9, 27, 1};
        int[] expected2 = {1, 27, 9, 12, 5, 3};
        Vector.reverseArray(array2);
        assertArrayEquals(expected2, array2);
    }

    @Test
    public void bubbleSort() {
        int[] array1 = new int[0];
        int[] expected1 = array1;
        Vector.bubbleSort(array1);
        assertArrayEquals(expected1, array1);

        int[] array2 = {12, 13, 41, 23, 4, 10};
        int[] expected2 = {4, 10, 12, 13, 23, 41};
        Vector.bubbleSort(array2);
        assertArrayEquals(expected2, array2);
    }

    @Test
    public void insertSort() {
        int[] array1 = new int[0];
        int[] expected1 = array1;
        assertArrayEquals(expected1, Vector.insertSort(array1));

        int[] array2 = {12, 13, 41, 23, 4, 10};
        int[] expected2 = {4, 10, 12, 13, 23, 41};
        assertArrayEquals(expected2, Vector.insertSort(array2));
    }

    @Test
    public void selectSort() {
        int[] array1 = new int[0];
        int[] expected1 = array1;
        Vector.selectSort(array1);
        assertArrayEquals(expected1, array1);

        int[] array2 = {12, 13, 41, 23, 4, 10};
        int[] expected2 = {4, 10, 12, 13, 23, 41};
        Vector.selectSort(array2);
        assertArrayEquals(expected2, array2);
    }

    @Test
    public void mergeSort() {
        int[] array1 = new int[0];
        int[] expected1 = array1;
        Vector.mergeSort(array1.length, array1);
        assertArrayEquals(expected1, array1);

        int[] array2 = {12, 13, 41, 23, 4, 10};
        int[] expected2 = {4, 10, 12, 13, 23, 41};
        Vector.mergeSort(array2.length, array2);
        assertArrayEquals(expected2, array2);
    }

    @Test
    public void qSort() {
        int[] array1 = new int[0];
        int[] expected1 = array1;
        Vector.qSort(array1);
        assertArrayEquals(expected1, array1);

        int[] array2 = {12, 13, 41, 23, 4, 10};
        int[] expected2 = {4, 10, 12, 13, 23, 41};
        Vector.qSort(array2);
        assertArrayEquals(expected2, array2);
    }

    @Test
    public void checkIncreaseSequence() {
        double[] array1 = new double[0];
        assertFalse(Vector.checkIncreaseSequence(array1));

        double[] array2 = {1, 3, 5, 9};
        assertTrue(Vector.checkIncreaseSequence(array2));

        double[] array3 = {4, 3, 5, 9};
        assertFalse(Vector.checkIncreaseSequence(array3));
    }

    @Test
    public void checkDecreaseSequence() {
        double[] array1 = new double[0];
        assertFalse(Vector.checkDecreaseSequence(array1));

        double[] array2 = {9, 5, 3, 1};
        assertTrue(Vector.checkDecreaseSequence(array2));

        double[] array3 = {4, 3, 5, 9};
        assertFalse(Vector.checkDecreaseSequence(array3));
    }

    @Test
    public void findLocalMax() {
        double[] array1 = new double[0];
        int expected1 = -1;
        assertEquals(expected1, Vector.findLocalMax(array1));

        double[] array2 = {3, 5, 12, 9, 27, 1};
        int expected2 = 2;
        assertEquals(expected2, Vector.findLocalMax(array2));

        double[] array3 = {3, 5, 1, 9, 27, 1};
        int expected3 = 1;
        assertEquals(expected3, Vector.findLocalMax(array3));
    }

    @Test
    public void findLocalMin() {
        double[] array1 = new double[0];
        int expected1 = -1;
        assertEquals(expected1, Vector.findLocalMin(array1));

        double[] array2 = {3, 5, 12, 9, 27, 1};
        int expected2 = 3;
        assertEquals(expected2, Vector.findLocalMin(array2));

        double[] array3 = {3, 5, 1, 9, 27, 1};
        int expected3 = 2;
        assertEquals(expected3, Vector.findLocalMin(array3));
    }
}
