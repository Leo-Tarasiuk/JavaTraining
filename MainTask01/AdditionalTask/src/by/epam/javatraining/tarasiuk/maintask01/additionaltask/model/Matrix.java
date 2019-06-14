package by.epam.javatraining.tarasiuk.maintask01.additionaltask.task1.model;

import org.apache.log4j.Logger;

/**
 * This class do some operations with matrix
 * development date: 12.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */

public class Matrix {
    public static Logger LOG = Logger.getRootLogger();
    /**
     * @param array - matrix
     * @return max value in matrix
     */
    public static int findMax(int[][] array) {
        if (isEmpty(array)) {
            LOG.warn("empty array");
            return -1;
        }

        int max = array[0][0];
        for (int[] mainArray : array) {
            for (int underArray : mainArray) {
                if (underArray > max) {
                    max = underArray;
                }
            }
        }

        return max;
    }

    /**
     * @param array - matrix
     * @return min value in matrix
     */
    public static int findMin(int[][] array) {
        if (isEmpty(array)) {
            LOG.warn("empty array");
            return -1;
        }

        int min = array[0][0];
        for (int[] mainArray : array) {
            for (int underArray : mainArray) {
                if (underArray < min) {
                    min = underArray;
                }
            }
        }

        return min;
    }

    /**
     * @param array - matrix
     * @return whether the matrix is ​​symmetric
     */
    public static boolean checkSymmetric(int[][] array) {
        if (isEmpty(array)) {
            LOG.warn("empty array");
            return false;
        }

        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                if (array[i][j] == array[j][i]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }

    /**
     * @param array - matrix
     * @return local min place
     */
    public static int[] findLocalMin(int[][] array) {
        if (isEmpty(array)) {
            LOG.warn("empty array");
            return new int[]{-1, -1};
        }

        int[] local = new int[2];
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                if (array[i][j] < array[i + 1][j] && array[i][j] < array[i - 1][j]
                        && array[i][j] < array[i][j + 1] && array[i][j] < array[i][j - 1]) {
                    local[0] = i;
                    local[1] = j;
                } else {
                    local[0] = -1;
                    local[1] = -1;
                }
            }
        }

        return local;
    }

    /**
     * @param array - matrix
     * @return local max place
     */
    public static int[] findLocalMax(int[][] array) {
        if (isEmpty(array)) {
            LOG.warn("empty array");
            return new int[]{-1, -1};
        }

        int[] local = new int[2];
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                if (array[i][j] > array[i + 1][j] && array[i][j] > array[i - 1][j]
                        && array[i][j] > array[i][j + 1] && array[i][j] > array[i][j - 1]) {
                    local[0] = i;
                    local[1] = j;
                } else {
                    local[0] = -1;
                    local[1] = -1;
                }
            }
        }

        return local;
    }

    /**
     * @param matrix - matrix for transpose
     */
    public static void transposeMatrix(int[][] matrix) {
        if (isEmpty(matrix)) {
            LOG.warn("empty array");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j != i; j--) {
                int w = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = w;
            }
        }
    }

    /**
     * @param array - matrix
     * @return whether the matrix is ​​empty
     */
    private static boolean isEmpty(int[][] array) {
        return array.length == 0;
    }
}
