package by.epam.javatraining.tarasiuk.maintask01.task7.model.logic;

/**
 * This class sorts vector
 * development date: 09.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */

public class ArraySortingLogic {

    /**
     * Method checks for an empty array
     *
     * @param array of elements
     * @return Is the array empty
     */
    private static boolean checkNull(int[] array) {
        return array.length == 0;
    }

    /**
     * Method checks whether one element in the array
     *
     * @param array of elements
     * @return Is there one element in the array
     */
    private static boolean checkLength(int[] array) {
        return array.length == 1;
    }

    /************bubble sort*************
     *
     * Bubble sorting is one of the simplest and most inefficient sorting (O(n^2))
     *
     * @param array of elements
     */
    public static void bubbleSort(int... array) {
        if (checkNull(array)) {
            return;
        } else if (checkLength(array)) {
            return;
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    /************insertion sort*************
     *
     * Sorting by inserts is most effective when the array is already partially sorted
     * and when there are not many elements of the array.
     * If the elements are less than 10, then this algorithm is the best. (O(n^2))
     *
     * @param array of elements
     * @return new array
     */
    public static int[] insertSort(int... array) {
        if (checkNull(array)) {
            return array;
        } else if (checkLength(array)) {
            return array;
        }

        int[] destinationArray = new int[array.length];
        int destinationSize = 0;
        for (int i = 0; i < array.length; i++) {
            int insertIndex = 0;
            if (destinationSize > 0) {
                while (insertIndex < destinationSize
                        && destinationArray[insertIndex] < array[i]) {
                    insertIndex++;
                }
            }
            for (int j = destinationSize - 1; j >= insertIndex; j--) {
                destinationArray[j + 1] = destinationArray[j];
            }
            destinationArray[insertIndex] = array[i];
            destinationSize++;
        }
        return destinationArray;
    }

    /************selection sort*************
     *
     *May be both stable and unstable (O(n^2))
     *
     * @param array of elements
     */
    public static void selectSort(int... array) {
        if (checkNull(array)) {
            return;
        } else if (checkLength(array)) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            double min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    /************merge sort*************
     *
     * Sophisticated sorting with recursion and logarithmic dependency ( O(n log n) )
     *
     * @param n - array.length
     * @param array of elements
     */
    public static void mergeSort(int n, int... array) {
        if (checkNull(array)) {
            return;
        } else if (checkLength(array)) {
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(mid, l);
        mergeSort(n - mid, r);

        merge(array, l, r, mid, n - mid);
    }

    /**
     * @param array of elements
     * @param l     - temporary array
     * @param r     - temporary array
     * @param left  - left bounds
     * @param right - right bounds
     */
    private static void merge(int[] array, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k++] = l[i++];
            } else {
                array[k++] = r[j++];
            }
        }
        while (i < left) {
            array[k++] = l[i++];
        }
        while (j < right) {
            array[k++] = r[j++];
        }
    }

    /************quick sort*************
     *
     * One of the fastest known universal array sorting algorithms ( O(n log n) )
     *
     * @param array of elements
     */
    public static void qSort(int... array) {
        if (checkNull(array)) {
            return;
        } else if (checkLength(array)) {
            return;
        }

        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(startIndex, endIndex, array);
    }

    /**
     * @param start - the beginning of the array
     * @param end   - end of array
     * @param array of elements
     */
    private static void doSort(int start, int end, int... array) {
        if (start >= end) {
            return;
        }

        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur, array);
        doSort(cur + 1, end, array);
    }
}