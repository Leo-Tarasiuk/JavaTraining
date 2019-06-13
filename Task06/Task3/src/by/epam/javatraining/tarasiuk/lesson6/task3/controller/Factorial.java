package by.epam.javatraining.tarasiuk.lesson6.task3.controller.logic;

import by.epam.javatraining.tarasiuk.lesson6.task3.model.logic.FactorialLogic;
import by.epam.javatraining.tarasiuk.lesson6.task3.view.logic.Printer;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int factorial = scanner.nextInt();
            int result = FactorialLogic.calcFact(factorial);
            Printer.print(result);
        } catch (Exception e) {
            Printer.printException();
        }
    }
}