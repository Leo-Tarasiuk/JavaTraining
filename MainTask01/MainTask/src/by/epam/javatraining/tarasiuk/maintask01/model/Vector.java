package by.epam.javatraining.tarasiuk.maintask01.model;

import org.apache.log4j.Logger;

/**
 * This class do some operations with vector
 * development date: 09.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */

public class Vector {
    public static Logger LOG = Logger.getRootLogger();

    /**
     * Method finds max
     *
     * @param array of numbers
     * @return max value
     */
    public static double findMax(double... array) {
        /*If array is empty, return 0
        If array contains one element, return this element*/
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
            return 0;
        }

        //finds max
        double max = array[0];
        for (double temp : array) {
            if (temp > max) {
                max = temp;
            }
        }

        return max;
    }

    /**
     * Method finds min
     *
     * @param array of numbers
     * @return min value
     */
    public static double findMin(double... array) {
        /*If array is empty, return 0
          If array contains one element, return this element*/
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
            return 0;
        }

        //finds min
        double min = array[0];
        for (double temp : array) {
            if (temp < min) {
                min = temp;
            }
        }

        return min;
    }

    /**
     * Method calculating arithmetic average
     *
     * @param array of numbers
     * @return arithmetic average
     */
    public static double calcAverage(double... array) {
        /*If array is empty, return 0
        If array contains one element, return this element*/
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
            return 0;
        }

        //calculate arithmetic average
        double sum = 0;
        for (double temp : array) {
            sum += temp;
        }

        return sum / array.length;
    }

    /**
     * Method calculating geometric average
     *
     * @param array of numbers
     * @return geometric average
     */
    public static double calcGeometricMean(double... array) {
        /*If array is empty, return 0
        If array contains one element, return this element*/
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
            return 0;
        }

        //calculate geometric average
        double com = 1;
        for (double temp : array) {
            com *= temp;
        }

        double result = 0;
        if (com > 0) {
            result = Math.pow(com, 1.0 / array.length);
        }

        return result;
    }

    /**
     * Method checks if the vector is increasing.
     *
     * @param array of numbers
     * @return if the vector is increasing.
     */
    public static boolean checkIncreaseSequence(double... array) {
//      If array is empty or contains one element, return false
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
            return false;
        }

        //Is it a sequence
        boolean isIncrease = true;
        double min = array[0];
        for (int i = 1; i < array.length && isIncrease; i++) {
            isIncrease = min < array[i];
        }

        return isIncrease;
    }

    /**
     * Method checks if the vector is decreasing or increasing.
     *
     * @param array of numbers
     * @return if the vector is decreasing or increasing.
     */
    public static boolean checkDecreaseSequence(double... array) {
//        If array is empty or contains one element, return false
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
            return false;
        }

        //Is it a sequence
        boolean isDecrease = true;
        double max = array[0];
        for (int i = 1; i < array.length && isDecrease; i++) {
            isDecrease = max > array[i];
        }

        return isDecrease;
    }

    /**
     * Method finds place of local max
     *
     * @param array of numbers
     * @return place of local max
     */
    public static int findLocalMax(double... array) {
//        If array is empty or contains one element, return false
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
            return -1;
        }

        //finds place of local max
        int local = -1;
        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i] > array[i - 1] && array[i] > array[i + 1])) {
                local = i;
                break;
            }
        }

        return local;
    }

    /**
     * Method finds place of local min
     *
     * @param array of numbers
     * @return place of local min
     */
    public static int findLocalMin(double... array) {
//        If array is empty or contains one element, return false
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
            return -1;
        }

        //finds place of local min
        int local = -1;
        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i] < array[i - 1] && array[i] < array[i + 1])) {
                local = i;
                break;
            }
        }

        return local;
    }

    /**
     * Method searches the element on the array with helps linear search
     *
     * @param element for searching
     * @param array   of elements
     * @return index of element
     */
    public static int linearSearch(double element, double... array) {
//        If array is empty or contains one element, return false
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
            return -1;
        }

        //search
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
            }
        }

        return index;
    }

    /**
     * searches the element on the array with helps binary search
     *
     * @param element for searching
     * @param array   of elements
     * @return index of element
     */
    public static int binarySearch(int element, int... array) {
//        If array is empty or contains one element, return false
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
            return -1;
        }

        array = insertSort(array);
        int index = -1;
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        //search
        while (firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;
            if (array[midIndex] == element) {
                index = midIndex;
                break;
            } else if (array[midIndex] < element) {
                firstIndex = midIndex + 1;
            } else if (array[midIndex] > element) {
                lastIndex = midIndex - 1;
            }
        }

        return index;
    }

    /**
     * Method reverses vector
     *
     * @param array of elements
     */
    public static void reverseArray(int... array) {
//        If array is empty or contains one element, return false
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
            return;
        }

        //reverse
        int bound = array.length / 2;
        for (int i = 0; i < bound; i++) {
            int w = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = w;
        }
    }

    /************bubble sort*************
     *
     * Bubble sorting is one of the simplest and most inefficient sorting (O(n^2))
     *
     * @param array of elements
     */
    public static void bubbleSort(int... array) {
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
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
//        If array is empty or contains one element, return false
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
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
//        If array is empty or contains one element, return false
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
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
//        If array is empty or contains one element, return false
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
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
//        If array is empty or contains one element, return false
        if (checkNull(array) || checkLength(array)) {
            LOG.warn("array is empty or has one element");
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

    /**
     * Method checks for an empty array
     *
     * @param array of numbers
     * @return Is the array empty
     */
    private static boolean checkNull(double[] array) {

        return array.length == 0;
    }

    /**
     * Method checks whether one element in the array
     *
     * @param array of numbers
     * @return Is there one element in the array
     */
    private static boolean checkLength(double[] array) {
        return array.length == 1;
    }
}
