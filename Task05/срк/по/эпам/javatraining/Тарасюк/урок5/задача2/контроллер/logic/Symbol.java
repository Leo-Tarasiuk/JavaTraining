package by.epam.javatraining.tarasiuk.lesson5.task2.controller.logic;

import by.epam.javatraining.tarasiuk.lesson5.task2.model.logic.SymbolLogic;
import by.epam.javatraining.tarasiuk.lesson5.task2.view.logic.Printer;

import java.util.Scanner;

public class Symbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char vowel = scanner.next().charAt(0);

        boolean  check = SymbolLogic.checkSymbolOne(vowel);

        Printer.print(check);
    }
}