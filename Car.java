package by.epam.javatraining.tarasiuk.taxi.maintask02.model;

/**
 * Class Car
 * development date: 19.06.2019
 *
 * @author Tarasiuk Leontiy
 * @version java "1.8.0_211"
 */
public class Car {
    private String name;
    private double coast;
    private int passengers;
    private double fuelConsumption;

    public Car() {

    }

    public Car(String name, double coast, int passengers, double fuelConsumption) {
        this.name = name;
        this.coast = coast;
        this.passengers = passengers;
        this.fuelConsumption = fuelConsumption;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        return this.getName().equals(car.getName()) && this.getPassengers() == car.getPassengers();
    }

    @Override
    public int hashCode() {
        return (int) (getCoast() * getFuelConsumption() + getPassengers());
    }

    @Override
    public String toString() {
        return getName() + ":\t\tcoast: " + getCoast()
                + ";\n\t\tnumber of passengers: " + getPassengers()
                + ";\n\t\tfuel consumption: " + getFuelConsumption() + ";\n";
    }

}