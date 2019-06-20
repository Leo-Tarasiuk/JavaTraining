package by.epam.javatraining.tarasiuk.taxi.maintask02.model;

/**
 * Class Search. Search taxis by different parameters
 * development date: 19.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */
public class Search {

    /**
     * searches cheapest taxi
     *
     * @return сheapest taxi
     */
    public static Taxi searchCheap(Taxi[] taxis) {
        if(isEmpty(taxis)) {
            return null;
        }

        Taxi min = taxis[0];
        for (Taxi car : taxis) {
            if (min.getPrice() > car.getPrice()) {
                min = car;
            }
        }

        return min;
    }

    /**
     * @return expensive taxi
     */
    public static Taxi searchExpensive(Taxi[] taxis) {
        if(isEmpty(taxis)) {
            return null;
        }

        Taxi max = taxis[0];
        for (Taxi car : taxis) {
            if (max.getPrice() < car.getPrice()) {
                max = car;
            }
        }

        return max;
    }

    /**
     * @return the biggest taxi
     */
    public static Taxi searchBig(Taxi[] taxis) {
        if(isEmpty(taxis)) {
            return null;
        }

        Taxi big = taxis[0];
        for (Taxi car : taxis) {
            if (big.getPassengers() > car.getPassengers()) {
                big = car;
            }
        }

        return big;
    }

    private static boolean isEmpty(Taxi[] taxis) {
        return taxis.length == 0;
    }
}
