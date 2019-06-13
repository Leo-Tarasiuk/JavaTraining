package by.epam.javatraining.tarasiuk.lesson5.task1.model.logic;

public class DragonLogic {

    public static final int FACTOR = 3;
    public static final int OLDFACTOR = 2;
    public static final int YOUNG_DRAGON = 200;
    public static final int OLD_DRAGON = 300;
    public static final int EYES = 2;

    public static int calcDragonHeads(int age) {
        if (checkValidValue(age)) {
            return 0;
        }

        int head = 3;
        if (age <= YOUNG_DRAGON) {
            head += age * FACTOR;
        } else if (age <= OLD_DRAGON) {
            head += (age - YOUNG_DRAGON) * OLDFACTOR + YOUNG_DRAGON * FACTOR;
        } else {
            head += (age - OLD_DRAGON) + (OLD_DRAGON - YOUNG_DRAGON) * OLDFACTOR + YOUNG_DRAGON * FACTOR + 1;
        }
        return head;
    }


    public static int calcDragonEyes(int age) {
        if (checkValidValue(age)) {
            return 0;
        }

        return EYES * calcDragonHeads(age);
    }

    private static boolean checkValidValue(int value) {
        return value < 0;
    }
}