package by.epam.javatraining.tarasiuk.taxi.maintask02.model;

/**
 * Class Sort. Sorts taxis by different parameters
 * development date: 19.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */
public class Sort {

    /**
     * sorts by fuel consumption
     */
    public static void sortFuel(Taxi[] taxis) {
        if(isEmpty(taxis)) {
            return;
        }

        for (int i = 0; i < taxis.length; i++) {
            for (int j = taxis.length - 1; j > i; j--) {
                if (taxis[i].getFuelConsumption() > taxis[j].getFuelConsumption()) {
                    Taxi temp = taxis[i];
                    taxis[i] = taxis[j];
                    taxis[j] = temp;
                }
            }
        }
    }

    /**
     * sorts by price
     */
    public static void sortPrice(Taxi[] taxis) {
        if(isEmpty(taxis)) {
            return;
        }

        for (int i = 0; i < taxis.length; i++) {
            for (int j = taxis.length - 1; j > i; j--) {
                if (taxis[i].getPrice() > taxis[j].getPrice()) {
                    Taxi temp = taxis[i];
                    taxis[i] = taxis[j];
                    taxis[j] = temp;
                }
            }
        }
    }

    /**
     * sorts by coast car
     */
    public static void sortCoast(Taxi[] taxis) {
        if(isEmpty(taxis)) {
            return;
        }
        for (int i = 0; i < taxis.length; i++) {
            for (int j = taxis.length - 1; j > i; j--) {
                if (taxis[i].getCoast() > taxis[j].getCoast()) {
                    Taxi temp = taxis[i];
                    taxis[i] = taxis[j];
                    taxis[j] = temp;
                }
            }
        }
    }

    private static boolean isEmpty(Taxi[] taxis) {
        return taxis.length == 0;
    }
}
