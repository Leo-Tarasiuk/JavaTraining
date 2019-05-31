package by.epam.javatraining.tarasiuk.lesson5.task3.model.logic;

import java.util.Random;

public class MoodLogic {
    private static final Random random = new Random();

    public static String checkMood() {
        int mood = getRandom();

        switch (mood) {
            case 1 : return "\uD83D\uDE08";
            case 2 : return "\uD83D\uDE21";
            case 3 : return "\uD83D\uDE01";
            case 4 : return "\uD83D\uDE2D";
            case 5 : return "\uD83D\uDE0D";
        }

        return "\uD83D\uDE35";
    }

    public static int getRandom() {
        return random.nextInt(5);
    }
}
