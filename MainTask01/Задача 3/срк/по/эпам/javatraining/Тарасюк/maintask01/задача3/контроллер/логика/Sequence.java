package by.epam.javatraining.tarasiuk.maintask01.task3.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task3.model.logic.SequenceLogic;
import by.epam.javatraining.tarasiuk.maintask01.task3.view.logic.Printer;

public class Sequence {
    public static void main(String[] args) {
        double[] array = {51, 23, 12, 4};

        boolean sequence = SequenceLogic.checkSequence(array);

        Printer.print(sequence);
    }
}
