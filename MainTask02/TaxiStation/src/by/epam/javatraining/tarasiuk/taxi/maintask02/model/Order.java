package by.epam.javatraining.tarasiuk.taxi.maintask02.model;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Order class. In it reads file with orders and creates new order(taxi)
 * development date: 19.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */
public class Order {

    private static String[] params = new String[5];
    private static Logger LOG = Logger.getRootLogger();

    /**
     * reads file with order
     *
     * @throws IOException
     */
    public static void readOrder() throws IOException {
        File file = new File("E://Java_trianing//MainTask02//Taxi.txt");
        Scanner scanner = new Scanner(file);

        int i = 0;
        while (scanner.hasNext()) {
            String taxi = scanner.next();
            if (isValid(taxi)) {
                params[i] = taxi;
            }
            i++;
        }
    }

    /**
     * @param str - one of the order parameters
     * @return if parameter is valid
     */
    private static boolean isValid(String str) {
        boolean valid = true;

        char[] invalidChars = {'\\', '/', ':', ';', ',', '!', '?', '\"', '(', ')'};
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            for (char invalidChar : invalidChars) {
                if (aChar == invalidChar) {
                    valid = false;
                }
            }
        }
        return valid;
    }

    /**
     * @return new Taxi - it is user order
     */
    public static Taxi createOrder() {
        String name = null;
        double coast = 0;
        int passengers = 0;
        double fuelConsumption = 0;

        try {
            name = params[0] + " " + params[1];
            coast = Double.parseDouble(params[2]);
            passengers = Integer.parseInt(params[3]);
            fuelConsumption = Double.parseDouble(params[4]);
        } catch (IndexOutOfBoundsException e) {
            LOG.warn("Please input valid order");
        }

        return new Taxi(name, coast, passengers, fuelConsumption);
    }

}
