package by.epam.javatraining.tarasiuk.maintask01.task6.model.logic;

/**
 * This class reverses vector
 * development date: 09.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */

public class ReverseLogic {
    /**
     * Method reverses vector
     *
     * @param array of elements
     */
    public static void reverseArray(int... array) {
        /*If array is empty, return
        If array contains one element, return*/
        if (checkNull(array)) {
            return;
        } else if (checkLength(array)) {
            return;
        }
        //reverse
        for (int i = 0; i < array.length / 2; i++) {
            int w = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = w;
        }
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
}