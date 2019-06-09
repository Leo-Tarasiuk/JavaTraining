package by.epam.javatraining.tarasiuk.maintask01.task6.model.logic;

public class ReverseLogic {
    public static void reverseArray(int[] array) {
        if (checkNull(array)) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            int w = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = w;
        }
    }

    private static boolean checkNull(int[] array) {
        return array.length == 0 || array.length == 1;
    }
}