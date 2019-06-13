package by.epam.javatraining.tarasiuk.lesson6.task4.controller.logic;

import by.epam.javatraining.tarasiuk.lesson6.task4.model.logic.EvenNumberLogic;
import by.epam.javatraining.tarasiuk.lesson6.task4.view.logic.Printer;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int value = scanner.nextInt();
            String msgEven = EvenNumberLogic.checkEven(value);
            String msgUneven = EvenNumberLogic.checkUneven(value);
            Printer.print(msgEven);
            Printer.print(msgUneven);
        } catch (Exception e) {
            Printer.printException();
        }
    }
}
