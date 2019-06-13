package by.epam.javatraining.tarasiuk.lesson5.task1.controller.logic;

import by.epam.javatraining.tarasiuk.lesson5.task1.model.logic.DragonLogic;
import by.epam.javatraining.tarasiuk.lesson5.task1.view.logic.Printer;

import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dragonHeads = 0;
        int dragonEyes = 0;

        try{
            int dragonAge = scanner.nextInt();
            dragonHeads = DragonLogic.calcDragonHeads(dragonAge);
            dragonEyes = DragonLogic.calcDragonEyes(dragonAge);
        } catch(Exception e) {
            Printer.printException();
        }

        Printer.print(dragonHeads);
        Printer.print(dragonEyes);
    }
}
