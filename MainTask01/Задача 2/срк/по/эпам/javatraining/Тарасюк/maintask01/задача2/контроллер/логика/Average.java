package by.epam.javatraining.tarasiuk.maintask01.task2.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task2.model.logic.AverageLogic;
import by.epam.javatraining.tarasiuk.maintask01.task2.view.logic.Printer;

public class Average {
    public static void main(String[] args) {
        double averageValue = AverageLogic.calcAverage(13, 43, 31, 55);
        double geometricValue = AverageLogic.calcGeometricMean(13, 43, 31, 55);

        Printer.print(averageValue);
        Printer.print(geometricValue);
    }
}
