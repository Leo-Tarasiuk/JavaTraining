package by.epam.javatraining.tarasiuk.lesson5.task1.model.logic;

public class DragonLogic {

    public static final int FACTOR = 3;

    public static final int NEWFACTOR = 2;

    public static int calcDragonHeads(int age) {
        if (checkValidValue(age)) {
            if (age < 200) {
                return age * FACTOR + 3;
            } else if (age < 300) {
                return (age - 200) * NEWFACTOR + 200 * FACTOR;
            } else {
                return (age - 300) + 100 * NEWFACTOR + 200 * FACTOR + 1;
            }
        } else {
            return 0;
        }
    }

    public static int calcDragonEyes(int age) {
        final int EYES = 2;

        if (checkValidValue(age)) {
            if (age < 200) {
                return (age * FACTOR + 3) * EYES;
            } else if (age < 300) {
                return ((age - 200) * NEWFACTOR + 200 * FACTOR) * EYES;
            } else {
                return ((age - 300) + 100 * NEWFACTOR + 200 * FACTOR + 1) * EYES;
            }
        } else {
            return 0;
        }
    }

    public static boolean checkValidValue(int value) {
        return value >= 0;
    }
}
