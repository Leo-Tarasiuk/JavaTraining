package by.epam.javatraining.tarasiuk.maintask01.task4.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task4.model.logic.LocalMaxMinLogic;
import by.epam.javatraining.tarasiuk.maintask01.task4.view.logic.Printer;

public class LocalMaxMin {
    public static void main(String[] args) {
        int local = LocalMaxMinLogic.findLocalMaxMin(2, 2, 3, 1, 4);

        Printer.print(local);
    }
}
