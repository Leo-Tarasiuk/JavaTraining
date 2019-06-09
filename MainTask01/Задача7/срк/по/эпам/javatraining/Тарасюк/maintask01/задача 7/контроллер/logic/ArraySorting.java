package by.epam.javatraining.tarasiuk.maintask01.task7.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task7.model.logic.ArraySortingLogic;
import by.epam.javatraining.tarasiuk.maintask01.task7.view.logic.Printer;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {12, 13, 4, 10};

        ArraySortingLogic.mergeSort(array, array.length);

        Printer.print(array);
    }
}
