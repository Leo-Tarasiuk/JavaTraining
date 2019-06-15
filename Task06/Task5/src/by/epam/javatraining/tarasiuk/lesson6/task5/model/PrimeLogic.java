package by.epam.javatraining.tarasiuk.lesson6.task5.model.logic;

public class PrimeLogic {
    public static boolean checkPrimeNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int count = 0;
        int bound = number / 2;
        for (int i = 2; i <= bound; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count == 0;
    }
}
