package by.epam.javatraining.tarasiuk.lesson6.task3.model.logic;

public class FactorialLogic {
    public static int calcFact(int fact) {
        if (checkValid(fact)) {
            int result = 1;
            for (int i = 1; i <= fact; i++) {
                result *= i;
            }

            return result;
        } else if (fact == 0) {
            return 1;
        }
        return 0;
    }

    private static boolean checkValid(int fact) {
        return fact > 0;
    }
}
