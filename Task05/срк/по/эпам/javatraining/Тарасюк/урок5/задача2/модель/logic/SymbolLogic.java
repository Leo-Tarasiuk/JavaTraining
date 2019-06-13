package by.epam.javatraining.tarasiuk.lesson5.task2.model.logic;

public class SymbolLogic {

    public static boolean checkSymbol(char vowel) {
        if (!checkValid(vowel)) {
            return false;
        }

        char[] array = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

        boolean isVowel = false;

        for (char a : array) {
            if (a == vowel) {
                isVowel = true;
            }
        }

        return isVowel;
    }

    public static boolean checkSymbolOne(char vowel) {
        if (!checkValid(vowel)) {
            return false;
        }

        boolean isVowel = false;

        switch (vowel) {
            case 'A':
            case 'u':
            case 'o':
            case 'i':
            case 'e':
            case 'a':
            case 'U':
            case 'O':
            case 'I':
            case 'E':
                isVowel = true;
        }

        return isVowel;
    }

    public static boolean checkSymbolTwo(char vowel) {
        if (!checkValid(vowel)) {
            return false;
        }

        boolean isVowel = false;

        if (vowel == 'A') {
            isVowel = true;
        } else if (vowel == 'U') {
            isVowel = true;
        } else if (vowel == 'O') {
            isVowel = true;
        } else if (vowel == 'I') {
            isVowel = true;
        } else if (vowel == 'E') {
            isVowel = true;
        } else if (vowel == 'u') {
            isVowel = true;
        } else if (vowel == 'o') {
            isVowel = true;
        } else if (vowel == 'i') {
            isVowel = true;
        } else if (vowel == 'e') {
            isVowel = true;
        } else if (vowel == 'a') {
            isVowel = true;
        }

        return isVowel;
    }

    private static boolean checkValid(char value) {
        char[] array = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".toCharArray();

        for (char symbol : array) {
            if (value == symbol) {
                return true;
            }
        }

        return false;
    }
}