package by.epam.javatraining.tarasiuk.maintask01.task7.view.logic;

public class Printer {
    public static void print(int[] array) {
        for (int temp: array) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }
}