package by.epam.javatraining.tarasiuk.lesson6.task4.model.logic;

public class EvenNumberLogic {
    public static String checkEven(int val) {
        boolean flag = true;

        while (flag && val != 0) {
            int a = val % 10;
            if (a % 2 == 0) {
                flag = true;
                val /= 10;
            } else {
                flag = false;
            }
        }

        return flag ? "even" : "uneven";
    }
}
