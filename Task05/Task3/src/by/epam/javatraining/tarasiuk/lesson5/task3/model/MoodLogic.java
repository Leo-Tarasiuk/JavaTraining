package by.epam.javatraining.tarasiuk.lesson5.task3.model.logic;

import java.util.Random;

public class MoodLogic {

    public static String checkMood() {
        int mood = getRandom();

        String face = "\uD83D\uDE0D";

        switch (mood) {
            case 1 : face = "\uD83D\uDE08";
            break;
            case 2 : face = "\uD83D\uDE21";
            break;
            case 3 : face = "\uD83D\uDE01";
            break;
            case 4 : face = "\uD83D\uDE2D";
            break;
        }

        return face;
    }

    private static int getRandom() {
        Random random = new Random();
        return random.nextInt(5);
    }
}
