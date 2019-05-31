package by.epam.javatraining.tarasiuk.lesson5.task2.model.logic;

public class SymbolLogic {

    public static boolean checkSymbol(char vowel) {
        if (checkValid(vowel)) {
            char[] array = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

            for (char a : array) {
                if (a == vowel) {
                    return true;
                }
            }

        }

        return false;
    }

    public static boolean checkSymbolOne(char vowel) {
        if (checkValid(vowel)) {

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
                    return true;
            }
        }

        return false;
    }

    public static boolean checkSymbolTwo(char vowel) {
        if (checkValid(vowel)) {
            if (vowel == 'A') {
                return true;
            } else if (vowel == 'U') {
                return true;
            } else if (vowel == 'O') {
                return true;
            } else if (vowel == 'I') {
                return true;
            } else if (vowel == 'E') {
                return true;
            } else if (vowel == 'u') {
                return true;
            } else if (vowel == 'o') {
                return true;
            } else if (vowel == 'i') {
                return true;
            } else if (vowel == 'e') {
                return true;
            } else return vowel == 'a';
        }
        return false;
    }

    public static boolean checkValid(char value) {
        char[] array = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".toCharArray();

        for (char symbol : array) {
            if (value == symbol) {
                return true;
            }
        }

        return false;
    }

}
