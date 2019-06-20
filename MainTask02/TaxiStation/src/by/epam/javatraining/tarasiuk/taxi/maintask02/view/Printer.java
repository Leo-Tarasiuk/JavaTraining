package by.epam.javatraining.tarasiuk.taxi.maintask02.view;

import org.apache.log4j.Logger;

public class Printer {

    private static Logger LOG = Logger.getRootLogger();

    public static void print(String msg) {
        LOG.info(msg);
    }
}
