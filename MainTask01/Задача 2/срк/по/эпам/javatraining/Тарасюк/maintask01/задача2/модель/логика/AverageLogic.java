package by.epam.javatraining.tarasiuk.maintask01.task2.model.logic;

/**
 * This class calculating arithmetic average and geometric average
 * development date: 09.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */

public class AverageLogic {

    /**
     * Method calculating arithmetic average
     *
     * @param array of numbers
     * @return arithmetic average
     */
    public static double calcAverage(double... array) {
        /*If array is empty, return 0
        If array contains one element, return this element*/
        if (checkNull(array)) {
            return 0;
        } else if (checkLength(array)) {
            return array[0];
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
        if (checkNull(array)) {
            return 0;
        } else if (checkLength(array)) {
            return array[0];
        }
        //calculate geometric average
        double com = 1;
        for (double temp : array) {
            com *= temp;
        }

        return Math.pow(com, 1.0 / array.length);
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