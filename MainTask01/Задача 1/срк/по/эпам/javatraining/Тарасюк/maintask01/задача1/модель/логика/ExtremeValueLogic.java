package by.epam.javatraining.tarasiuk.maintask01.task1.model.logic;

/**
 * This class finds max & min values
 * development date: 09.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */

public class ExtremeValueLogic {

    /**
     * Method finds max
     *
     * @param array of numbers
     * @return max value
     */
    public static double findMax(double... array) {
        /*If array is empty, return 0
        If array contains one element, return this element*/
        if (checkNull(array)) {
            return 0;
        } else if (checkLength(array)) {
            return array[0];
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
        if (checkNull(array)) {
            return 0;
        } else if (checkLength(array)) {
            return array[0];
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