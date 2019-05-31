package by.epam.javatraining.tarasiuk.lesson5.task3.controller.logic;

import by.epam.javatraining.tarasiuk.lesson5.task3.model.logic.MoodLogic;
import by.epam.javatraining.tarasiuk.lesson5.task3.view.logic.Printer;

public class Mood {
    public static void main(String[] args) {
        String smile = MoodLogic.checkMood();

        Printer.print(smile);
    }
}
