package by.epam.javatraining.tarasiuk.maintask01.task1.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task1.model.logic.ExtremeValueLogic;
import by.epam.javatraining.tarasiuk.maintask01.task1.view.logic.Printer;

public class ExtremeValue {
    public static void main(String[] args) {
        double[] array = {3, 5, 12, 9, 27, 1};

        double max = ExtremeValueLogic.findMax(array);
        double min = ExtremeValueLogic.findMin(array);

        Printer.print(max);
        Printer.print(min);
    }
}
