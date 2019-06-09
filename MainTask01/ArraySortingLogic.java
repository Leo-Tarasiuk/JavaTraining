package by.epam.javatraining.tarasiuk.maintask01.task7.model.logic;

public class ArraySortingLogic {

    private static boolean checkNull(int[] array) {
        return array.length == 0 || array.length == 1;
    }

    //------------------bubble sort-----------------------
    public static void bubbleSort(int[] array) {
        if (checkNull(array)) {
            return;
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    //------------------insertion sort-----------------------
    public static int[] insertSort(int[] array) {
        if (checkNull(array)) {
            return array;
        }

        int[] destinationArray = new int[array.length];
        int destinationSize = 0;
        for (int i = 0; i < array.length; i++) {
            int insertIndex = 0;
            if (destinationSize > 0) {
                while (insertIndex < destinationSize
                        && destinationArray[insertIndex] < array[i]) {
                    insertIndex++;
                }
            }
            for (int j = destinationSize - 1; j >= insertIndex; j--) {
                destinationArray[j + 1] = destinationArray[j];
            }
            destinationArray[insertIndex] = array[i];
            destinationSize++;
        }
        return destinationArray;
    }

    //------------------selection sort-----------------------
    public static void selectSort(int[] array) {
        if (checkNull(array)) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            double min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    //------------------merge sort-----------------------
    public static void mergeSort(int[] array, int n) {
        if(checkNull(array)) {
            return;
        }

        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);
    }

    public static void merge(int[] array, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k++] = l[i++];
            }
            else {
                array[k++] = r[j++];
            }
        }
        while (i < left) {
            array[k++] = l[i++];
        }
        while (j < right) {
            array[k++] = r[j++];
        }
    }

    //------------------quick sort-----------------------
    public static void qSort(int[] array) {
        if(checkNull(array)) {
            return;
        }

        int startIndex = 0;
        int endIndex =  array.length - 1;
        doSort(array, startIndex, endIndex);
    }

    private static void doSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(array, start, cur);
        doSort(array,cur+1, end);
    }
}