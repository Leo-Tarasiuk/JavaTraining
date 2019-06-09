package by.epam.javatraining.tarasiuk.maintask01.task1.model.logic;

public class ExtremeValueLogic {
    public static double findMax(double[] array) {
        if (checkNull(array)) {
            return 0;
        }

        double max = array[0];
        for (double temp : array) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public static double findMin(double[] array) {
        if (checkNull(array)) {
            return 0;
        }

        double min = array[0];
        for (double temp : array) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    private static boolean checkNull(double[] array) {
        return array.length == 0;
    }
}