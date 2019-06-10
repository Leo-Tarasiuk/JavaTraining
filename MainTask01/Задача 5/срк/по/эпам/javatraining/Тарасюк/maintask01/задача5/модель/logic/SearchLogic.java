package by.epam.javatraining.tarasiuk.maintask01.task5.model.logic;

/**
 * This class searches the element on the array
 * development date: 09.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */

public class SearchLogic {
    /**
     * Method searches the element on the array with helps linear search
     *
     * @param element for searching
     * @param array   of elements
     * @return index of element
     */
    public static int linearSearch(double element, double... array) {
        /*If array is empty, return -1
        If array contains one element, return -1*/
        if (checkNull(array)) {
            return -1;
        } else if (checkLength(array)) {
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
    public static int binarySearch(double element, double... array) {
        /*If array is empty, return -1
        If array contains one element, return -1*/
        if (checkNull(array)) {
            return -1;
        } else if (checkLength(array)) {
            return -1;
        }

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
     * Method checks for an empty array
     *
     * @param array of elements
     * @return Is the array empty
     */
    private static boolean checkNull(double[] array) {
        return array.length == 0;
    }

    /**
     * Method checks whether one element in the array
     *
     * @param array of elements
     * @return Is there one element in the array
     */
    private static boolean checkLength(double[] array) {
        return array.length == 1;
    }
}