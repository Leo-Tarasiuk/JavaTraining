package by.epam.javatraining.tarasiuk.maintask01.additionaltask.task1.controller;

import by.epam.javatraining.tarasiuk.maintask01.additionaltask.task1.model.Matrix;
import by.epam.javatraining.tarasiuk.maintask01.additionaltask.task1.view.Printer;

import java.util.Arrays;

public class MainMatrix {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        array[0] = new int[]{1, 2, 3};
        array[1] = new int[]{4, 5, 6};
        array[2] = new int[]{7, 8, 9};

        int max = Matrix.findMax(array);
        int min = Matrix.findMin(array);
        Printer.print(max);
        Printer.print(min);

        boolean isSymmetric = Matrix.checkSymmetric(array);
        Printer.print(isSymmetric);

        int[] localMax = Matrix.findLocalMax(array);
        Printer.print(Arrays.toString(localMax));

        int[] localMin = Matrix.findLocalMin(array);
        Printer.print(Arrays.toString(localMin));

        Matrix.transposeMatrix(array);
        for (int[] tempOut : array) {
            Printer.print(Arrays.toString(tempOut));
        }
    }
}