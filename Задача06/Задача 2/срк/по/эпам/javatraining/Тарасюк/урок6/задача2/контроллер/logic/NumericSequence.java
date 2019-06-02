package by.epam.javatraining.tarasiuk.lesson6.task2.controller.logic;

import by.epam.javatraining.tarasiuk.lesson6.task2.model.logic.NumericSequenceLogic;
import by.epam.javatraining.tarasiuk.lesson6.task2.view.logic.Printer;

import java.util.Scanner;

public class NumericSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int sequence = scanner.nextInt();
            boolean increase = NumericSequenceLogic.checkIncreaseSequence(sequence);
            boolean decrease = NumericSequenceLogic.checkDecreaseSequence(sequence);
            Printer.print(increase, decrease);
        } catch (Exception e){
            Printer.printException();
        }
    }
}
