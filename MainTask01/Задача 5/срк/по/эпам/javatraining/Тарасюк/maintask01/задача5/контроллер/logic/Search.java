package by.epam.javatraining.tarasiuk.maintask01.task5.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task5.model.logic.SearchLogic;
import by.epam.javatraining.tarasiuk.maintask01.task5.view.logic.Printer;

public class Search {
    public static void main(String[] args) {
        int index1 = SearchLogic.linearSearch(12, 23, 12, 32, 54);
        int index2 = SearchLogic.binarySearch(12, 23, 12, 32, 54);

        Printer.print(index1);
        Printer.print(index2);
    }
}
