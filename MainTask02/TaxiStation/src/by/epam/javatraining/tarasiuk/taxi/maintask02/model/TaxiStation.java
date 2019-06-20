package by.epam.javatraining.tarasiuk.taxi.maintask02.model;

import by.epam.javatraining.tarasiuk.taxi.maintask02.view.Printer;

/**
 * Taxi Station class. In it creates new taxi, checks orders, and do some sorts and search
 * development date: 19.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */
public class TaxiStation {
    private static double bank = 1_000_000;
    private static Taxi[] taxis = new Taxi[4];

    /**
     * @return the sum of all cars
     */
    public static double calcCoast() {
        double sum = 0;
        for (Car car : taxis) {
            sum += car.getCoast();
        }

        return sum;
    }

    public static Taxi[] getTaxis() {
        return taxis;
    }

    public static void setTaxis(Taxi[] taxis) {
        TaxiStation.taxis = taxis;
    }

    /**
     * @return money, which taxi station has
     */
    public static double getBank() {
        return bank;
    }

    /**
     * @param bank - change bank
     */
    public static void setBank(double bank) {
        TaxiStation.bank = bank;
    }

    /**
     * add new car in taxi station
     */
    public static void createTaxi() {
        taxis[0] = new Taxi("Volkswagen polo", 13500, 5, 1.6);
        taxis[1] = new Taxi("Volkswagen polo", 10100, 5, 1.6);
        taxis[2] = new Taxi("BMW 5", 19000, 5, 4.4);
        taxis[3] = new Taxi("Volkswagen Sharan", 16000, 7, 2.0);

        for (Taxi car : taxis) {
            setBank(bank - car.getCoast());
        }
    }

    /**
     * output all cars, which are in taxi station in file(logging)
     */
    public static void Taxis() {
        for (Taxi car : taxis) {
            Printer.print(car.toString());
            Printer.print("Example to input:\t" + car.getName() + " " + car.getCoast()
                    + " " + car.getPassengers() + " " + car.getFuelConsumption());
        }
    }

    /**
     * checks order is not busy or if it has in taxi station
     *
     * @param order - user orders
     * @return order is processed or no
     */
    public static boolean checkOrder(Taxi order) {
        if(order == null) {
            return false;
        }

        boolean ord = false;
        for (Taxi car : taxis) {
            boolean isBusy = car.isBusy();
            if (!isBusy && car.equals(order)) {
                car.setBusy(true);
                ord = true;
                setBank(bank + car.getPrice());
                break;
            }
        }

        return ord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }

        TaxiStation taxiStation = (TaxiStation) o;
        return this.hashCode() == taxiStation.hashCode();
    }

    @Override
    public int hashCode() {
        return (int) (bank * taxis.length);
    }

    @Override
    public String toString() {
        return "TaxiStation: " + hashCode();
    }
}
