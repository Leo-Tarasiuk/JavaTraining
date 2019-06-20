package by.epam.javatraining.tarasiuk.taxi.maintask02.model;

/**
 * Taxi class extends class Car.
 * development date: 19.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */
public class Taxi extends Car {
    private double price = getCoast() / 10000 * getFuelConsumption();
    private boolean busy = false;

    public Taxi(String name, double coast, int passengers, double fuelConsumption) {
        super(name, coast, passengers, fuelConsumption);
    }

    public Taxi() {

    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Taxi taxi = (Taxi) o;
        return price == taxi.getPrice();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (int) getPrice();
    }

    @Override
    public String toString() {
        return getName() + ":\t\tprice: " + getPrice()
                + ";\n\t\tnumber of passengers: " + getPassengers() + ";\n";
    }

}