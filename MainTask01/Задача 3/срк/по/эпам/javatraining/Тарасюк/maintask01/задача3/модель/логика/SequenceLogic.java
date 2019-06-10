package by.epam.javatraining.tarasiuk.maintask01.task3.model.logic;

/**
 * This class checks if the vector is decreasing or increasing.
 * development date: 09.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */

public class SequenceLogic {
    /**
     * Method checks if the vector is decreasing or increasing.
     *
     * @param array of numbers
     * @return if the vector is decreasing or increasing.
     */
    public static boolean checkSequence(double... array) {
        /*If array is empty, return false
        If array contains one element, return false*/
        if (checkNull(array)) {
            return false;
        } else if (checkLength(array)) {
            return false;
        }
        //Is it a sequence
        boolean isSequence = true;
        double max = array[0];
        if (max > array[1]) {
            for (int i = 2; i < array.length && isSequence; i++) {
                isSequence = max > array[i];
            }
        } else if (max < array[1]) {
            for (int i = 2; i < array.length && isSequence; i++) {
                isSequence = max < array[i];
            }
        }
        return isSequence;
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