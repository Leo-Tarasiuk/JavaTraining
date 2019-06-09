package by.epam.javatraining.tarasiuk.maintask01.task4.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task4.model.logic.LocalMaxMinLogic;
import by.epam.javatraining.tarasiuk.maintask01.task4.view.logic.Printer;

public class LocalMaxMin {
    public static void main(String[] args) {
        double[] array = {1, 2, 3, 2, 4, 4};

        int local = LocalMaxMinLogic.findLocalMaxMin(array);

        Printer.print(local);
    }
}
