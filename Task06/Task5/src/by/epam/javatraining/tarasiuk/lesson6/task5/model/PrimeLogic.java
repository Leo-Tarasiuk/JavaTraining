package by.epam.javatraining.tarasiuk.lesson6.task5.model.logic;

public class PrimeLogic {
    public static boolean checkPrimeNumber(int number) {
        if (checkValid(number)) {
            return false;
        }

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count == 2;
    }

    private static boolean checkValid(int number) {
        return number <= 0;
    }
}