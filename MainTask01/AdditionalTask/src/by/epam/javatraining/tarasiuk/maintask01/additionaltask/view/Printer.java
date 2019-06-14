package by.epam.javatraining.tarasiuk.maintask01.additionaltask.task1.view;

import org.apache.log4j.Logger;

public class Printer {
    public static Logger LOG = Logger.getRootLogger();

    public static void print(Object value) {
        LOG.info(value);
    }
}
