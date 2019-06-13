package by.epam.javatraining.tarasiuk.lesson6.task5.controller.logic;

import by.epam.javatraining.tarasiuk.lesson6.task5.model.logic.PrimeLogic;
import by.epam.javatraining.tarasiuk.lesson6.task5.view.logic.Printer;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int number = scanner.nextInt();
            boolean checkPrime = PrimeLogic.checkPrimeNumber(number);
            Printer.print(checkPrime);
        } catch (Exception e) {
            Printer.printException();
        }
    }
}