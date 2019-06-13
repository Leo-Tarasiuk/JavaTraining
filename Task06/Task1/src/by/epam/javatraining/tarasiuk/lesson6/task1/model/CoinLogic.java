package by.epam.javatraining.tarasiuk.lesson6.task1.model.logic;

import java.util.Random;

public class CoinLogic {

    private static int Eagle;
    private static int Tale;

    public static void calcSide(int shot) {
        if (checkValid(shot)) {
            Random random = new Random();
            for (int i = 0; i < shot; i++) {
                int side = random.nextInt(2);
                if (side == 0) {
                    Eagle++;
                } else {
                    Tale++;
                }
            }
        }
    }

    private static boolean checkValid(int shot) {
        return shot > 0;
    }

    public static int getEagle() {
        return Eagle;
    }

    public static int getTale() {
        return Tale;
    }
}
