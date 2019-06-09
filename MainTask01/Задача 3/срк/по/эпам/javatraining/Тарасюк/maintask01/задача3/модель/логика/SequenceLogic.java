package by.epam.javatraining.tarasiuk.maintask01.task3.model.logic;

public class SequenceLogic {
    public static boolean checkSequence(double[] array) {
        if (checkNull(array)) {
            return false;
        }

        boolean flag = true;
        double max = array[0];
        if (max > array[1]) {
            for (int i = 2; i < array.length && flag; i++) {
                flag = max > array[i];
            }
        } else if (max < array[1]) {
            for (int i = 2; i < array.length && flag; i++) {
                flag = max < array[i];
            }
        }
        return flag;
    }

    private static boolean checkNull(double[] array) {
        return array.length == 0;
    }
}
