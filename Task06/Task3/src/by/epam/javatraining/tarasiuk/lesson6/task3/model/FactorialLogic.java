package by.epam.javatraining.tarasiuk.lesson6.task3.model.logic;

public class FactorialLogic {
    public static int calcFact(int fact) {
        if (checkValid(fact)) {
            return 0;
        }

        int result = 1;
        for (int i = 1; i <= fact; i++) {
            result *= i;
        }

        return result;
    }

    private static boolean checkValid(int fact) {
        return fact < 0;
    }
}