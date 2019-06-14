package by.epam.javatraining.tarasiuk.maintask01.controller;

import by.epam.javatraining.tarasiuk.maintask01.model.Vector;
import by.epam.javatraining.tarasiuk.maintask01.view.Printer;

import java.util.Arrays;


public class MainVector {
    public static void main(String[] args) {
        double max = Vector.findMax(12, 2, 23, 41);
        double min = Vector.findMin(12, 2, 23, 41);
        Printer.print(max);
        Printer.print(min);

        double average = Vector.calcAverage(12, 2, 23, 41);
        double geometry = Vector.calcGeometricMean(12, 2, 23, 41);
        Printer.print(average);
        Printer.print(geometry);

        boolean isSequence = Vector.checkIncreaseSequence(12, 2, 23, 41);
        Printer.print(isSequence);

        int local = Vector.findLocalMax(12, 2, 23, 41);
        Printer.print(local);

        int element1 = Vector.linearSearch(12, 12, 2, 23, 41);
        int element2 = Vector.binarySearch(23, 12, 2, 23, 41);
        Printer.print(element1);
        Printer.print(element2);

        int[] array = {12, 2, 23, 41};
        Vector.reverseArray(array);
        Printer.print(Arrays.toString(array));

        Vector.bubbleSort(array);
        Printer.print(Arrays.toString(array));
    }
}