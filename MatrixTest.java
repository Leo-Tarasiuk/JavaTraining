package by.epam.javatraining.tarasiuk.maintask01.additionaltask.task1.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void findMax() {
        int[][] array1 = new int[0][];
        int expected1 = -1;
        assertEquals(expected1, Matrix.findMax(array1));

        int[][] array2 = new int[3][3];
        array2[0] = new int[] {1, 2, 3};
        array2[1] = new int[] {4, 5, 6};
        array2[2] = new int[] {7, 8, 9};
        int expected2 = 9;
        assertEquals(expected2, Matrix.findMax(array2));
    }

    @Test
    public void findMin() {
        int[][] array1 = new int[0][];
        int expected1 = -1;
        assertEquals(expected1, Matrix.findMin(array1));

        int[][] array2 = new int[3][3];
        array2[0] = new int[] {4, 2, 3};
        array2[1] = new int[] {4, 1, 6};
        array2[2] = new int[] {7, 8, 9};
        int expected2 = 1;
        assertEquals(expected2, Matrix.findMin(array2));
    }

    @Test
    public void checkSymmetric() {
        int[][] array1 = new int[0][];
        assertFalse(Matrix.checkSymmetric(array1));

        int[][] array2 = new int[3][3];
        array2[0] = new int[] {1, 0, 0};
        array2[1] = new int[] {0, 1, 0};
        array2[2] = new int[] {0, 0, 1};
        assertTrue(Matrix.checkSymmetric(array2));
    }

    @Test
    public void findLocalMin() {
        int[][] array1 = new int[0][];
        int[] expected1 = {-1, -1};
        assertArrayEquals(expected1, Matrix.findLocalMin(array1));

        int[][] array2 = new int[3][3];
        array2[0] = new int[] {1, 8, 3};
        array2[1] = new int[] {6, 5, 6};
        array2[2] = new int[] {7, 8, 9};
        int[] expected = {1,1};
        assertArrayEquals(expected, Matrix.findLocalMin(array2));
    }

    @Test
    public void findLocalMax() {
        int[][] array1 = new int[0][];
        int[] expected1 = {-1, -1};
        assertArrayEquals(expected1, Matrix.findLocalMax(array1));

        int[][] array2 = new int[3][3];
        array2[0] = new int[] {1, 2, 3};
        array2[1] = new int[] {4, 5, 4};
        array2[2] = new int[] {7, 2, 9};
        int[] expected = {1,1};
        assertArrayEquals(expected, Matrix.findLocalMax(array2));
    }

    @Test
    public void transposeMatrix() {
        int[][] array1 = new int[0][];
        int[][] expected1 = array1;
        Matrix.transposeMatrix(array1);
        assertArrayEquals(expected1,array1);

        int[][] array2 = new int[3][3];
        array2[0] = new int[] {1, 2, 3};
        array2[1] = new int[] {4, 5, 6};
        array2[2] = new int[] {7, 8, 9};
        Matrix.transposeMatrix(array2);
        int[][] expected2 = {{1, 4, 7},
                             {2, 5, 8},
                             {3, 6, 9}};
        assertArrayEquals(expected2, array2);
    }
}