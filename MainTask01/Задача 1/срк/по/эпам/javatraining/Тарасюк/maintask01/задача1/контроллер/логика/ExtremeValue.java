package by.epam.javatraining.tarasiuk.maintask01.task1.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task1.model.logic.ExtremeValueLogic;
import by.epam.javatraining.tarasiuk.maintask01.task1.view.logic.Printer;

public class ExtremeValue {
    public static void main(String[] args) {
        double max = ExtremeValueLogic.findMax(213, 42, 12, 3);
        double min = ExtremeValueLogic.findMin(213, 42, 12, 3);

        Printer.print(max);
        Printer.print(min);
    }
}
