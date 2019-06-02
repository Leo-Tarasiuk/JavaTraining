package by.epam.javatraining.tarasiuk.lesson6.task1.controller.logic;

import by.epam.javatraining.tarasiuk.lesson6.task1.model.logic.CoinLogic;
import by.epam.javatraining.tarasiuk.lesson6.task1.view.logic.Printer;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            int shot = scanner.nextInt();
            CoinLogic.calcSide(shot);
            int eagle = CoinLogic.getEagle();
            int tale = CoinLogic.getTale();
            Printer.print(eagle, tale);
        } catch (Exception e) {
            Printer.printException();
        }
    }
}
