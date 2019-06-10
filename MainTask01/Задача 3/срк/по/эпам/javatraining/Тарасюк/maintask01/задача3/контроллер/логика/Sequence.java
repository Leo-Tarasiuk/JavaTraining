package by.epam.javatraining.tarasiuk.maintask01.task3.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task3.model.logic.SequenceLogic;
import by.epam.javatraining.tarasiuk.maintask01.task3.view.logic.Printer;

public class Sequence {
    public static void main(String[] args) {
        boolean sequence = SequenceLogic.checkSequence(41, 32, 15, 9);

        Printer.print(sequence);
    }
}
