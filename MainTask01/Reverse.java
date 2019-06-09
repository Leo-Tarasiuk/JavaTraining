package by.epam.javatraining.tarasiuk.maintask01.task6.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task6.model.logic.ReverseLogic;
import by.epam.javatraining.tarasiuk.maintask01.task6.view.logic.Printer;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {3, 5, 12, 9, 27, 1};

        ReverseLogic.reverseArray(array);

        Printer.print(array);
    }
}
