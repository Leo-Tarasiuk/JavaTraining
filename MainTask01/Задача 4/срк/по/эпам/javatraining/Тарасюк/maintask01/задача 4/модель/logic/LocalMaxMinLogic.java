package by.epam.javatraining.tarasiuk.maintask01.task4.model.logic;

/**
 * This class finds place of local max or min
 * development date: 09.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */

public class LocalMaxMinLogic {
    /**
     * Method finds place of local max or min
     *
     * @param array of numbers
     * @return place of local max or min
     */
    public static int findLocalMaxMin(double... array) {
        /*If array is empty, return 0
        If array contains one element, return 0*/
        if (checkNull(array)) {
            return 0;
        } else if (checkLength(array)) {
            return 0;
        }
        //finds place of local max or min
        int local = -1;
        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i] > array[i - 1] && array[i] > array[i + 1])
                    || (array[i] < array[i - 1] && array[i] < array[i + 1])) {
                local = i;
                break;
            }
        }
        return local;
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