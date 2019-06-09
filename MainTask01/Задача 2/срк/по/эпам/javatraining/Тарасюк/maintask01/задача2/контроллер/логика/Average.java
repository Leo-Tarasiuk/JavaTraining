package by.epam.javatraining.tarasiuk.maintask01.task2.controller.logic;

import by.epam.javatraining.tarasiuk.maintask01.task2.model.logic.AverageLogic;
import by.epam.javatraining.tarasiuk.maintask01.task2.view.logic.Printer;

public class Average {
    public static void main(String[] args) {
        double[] array = {3, 5, 12, 9, 27, 1};

        double averageValue = AverageLogic.calcAverage(array);
        double geometricValue = AverageLogic.calcGeometricMean(array);

        Printer.print(averageValue);
        Printer.print(geometricValue);
    }
}
