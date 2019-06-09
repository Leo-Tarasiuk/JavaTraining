package by.epam.javatraining.tarasiuk.maintask01.task5.model.logic;

public class SearchLogic {
    public static int linearSearch(double[] array, double element) {
        if (checkNull(array)) {
            return -1;
        }

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
            }
        }
        return index;
    }

    public static int binarySearch(double[] array, double element) {
        if (checkNull(array)) {
            return -1;
        }

        int index = -1;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;
            if (array[midIndex] == element) {
                index = midIndex;
                break;
            } else if (array[midIndex] < element) {
                firstIndex = midIndex + 1;
            } else if (array[midIndex] > element) {
                lastIndex = midIndex - 1;
            }
        }
        return index;
    }

    private static boolean checkNull(double[] array) {
        return array.length == 0;
    }
}
