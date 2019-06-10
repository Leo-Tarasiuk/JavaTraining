package by.epam.javatraining.tarasiuk.maintask01.task7.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task7.model.logic.ArraySortingLogic;
import by.epam.javatraining.tarasiuk.maintask01.task7.view.logic.Printer;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array1 = {12, 13, 4, 10};
        int[] array2 = {11, 5, 4, 9};
        int[] array3 = {34, 23, 18, 6};
        int[] array4 = {5, 41, 22, 11};
        int[] array5 = {7, 33, 29, 25};

        ArraySortingLogic.bubbleSort(array1);
        Printer.print(array1);

        ArraySortingLogic.insertSort(array2);
        Printer.print(array2);

        ArraySortingLogic.selectSort(array3);
        Printer.print(array3);

        ArraySortingLogic.qSort(array4);
        Printer.print(array4);

        ArraySortingLogic.mergeSort(array5.length, array5);
        Printer.print(array5);
    }
}