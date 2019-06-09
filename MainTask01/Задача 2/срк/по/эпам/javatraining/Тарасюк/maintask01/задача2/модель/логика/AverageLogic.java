package by.epam.javatraining.tarasiuk.maintask01.task2.model.logic;

public class AverageLogic {
    public static double calcAverage(double[] array) {
        if (checkNull(array)) {
            return 0;
        }

        double sum = 0;
        for (double temp : array) {
            sum += temp;
        }

        return sum / array.length;
    }

    public static double calcGeometricMean(double[] array) {
        if (checkNull(array)) {
            return 0;
        }

        double com = 1;
        for (double temp : array) {
            com *= temp;
        }

        return Math.pow(com, 1.0 / array.length);
    }

    private static boolean checkNull(double[] array) {
        return array.length == 0;
    }
}