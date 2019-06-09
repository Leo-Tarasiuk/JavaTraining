package by.epam.javatraining.tarasiuk.maintask01.task4.model.logic;

public class LocalMaxMinLogic {
    public static int findLocalMaxMin(double[] array) {
        if (checkNull(array)) {
            return 0;
        }

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

    private static boolean checkNull(double[] array) {
        return array.length == 0;
    }
}