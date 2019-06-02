package by.epam.javatraining.tarasiuk.lesson6.task2.view.logic;

public class Printer {
    public static void print(boolean increase, boolean decrease) {
        System.out.println("Increase sequence - " + increase
                + "\nDecrease sequence - " + decrease);
    }

    public static void printException() {
        System.out.println("Invalid value");
    }
}
