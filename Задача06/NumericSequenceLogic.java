package by.epam.javatraining.tarasiuk.lesson6.task2.model.logic;

public class NumericSequenceLogic {
    public static boolean checkIncreaseSequence(int sequence) {
        if(checkNumber(sequence)) {
            int num1 = sequence % 10;
            boolean flag = true;

            while (flag && sequence != 0) {
                sequence /= 10;
                int num2 = sequence % 10;
                if (num1 > num2) {
                    flag = true;
                    num1 = num2;
                } else {
                    flag = false;
                }
            }

            return flag;
        }
        return false;
    }

    public static boolean checkDecreaseSequence(int sequence) {
        if (checkNumber(sequence)) {
            int num1 = sequence % 10;
            boolean flag = true;

            while (flag && sequence != 0) {
                sequence /= 10;
                int num2 = sequence % 10;
                if (num1 < num2 || num2 == 0) {
                    flag = true;
                    num1 = num2;
                } else {
                    flag = false;
                }
            }

            return flag;
        }
        return false;
    }

    private static boolean checkNumber(int sequence) {
        return sequence >= 10;
    }

}
