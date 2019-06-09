package by.epam.javatraining.tarasiuk.maintask01.task5.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task5.model.logic.SearchLogic;
import by.epam.javatraining.tarasiuk.maintask01.task5.view.logic.Printer;

public class Search {
    public static void main(String[] args) {
        double[] array = {3, 5, 12, 9, 27, 1};

        int index1 = SearchLogic.linearSearch(array, 12);
        int index2 = SearchLogic.binarySearch(array, 12);

        Printer.print(index1);
        Printer.print(index2);
    }
}
