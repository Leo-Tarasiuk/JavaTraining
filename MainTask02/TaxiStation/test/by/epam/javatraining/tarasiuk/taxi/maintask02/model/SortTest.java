package by.epam.javatraining.tarasiuk.taxi.maintask02.model;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortTest {

    @Test
    public void testSortFuel() {
        TaxiStation.createTaxi();
        Taxi[] taxis1 = new Taxi[0];
        Taxi[] expected1 = new Taxi[0];
        Sort.sortFuel(taxis1);
        assertEquals(expected1, taxis1);

        Taxi[] taxis2 = TaxiStation.getTaxis();
        Taxi[] expected2 = {new Taxi("Volkswagen polo", 13500, 5, 1.6),
                new Taxi("Volkswagen polo", 10100, 5, 1.6),
                new Taxi("Volkswagen Sharan", 16000, 7, 2.0),
                new Taxi("BMW 5", 19000, 5, 4.4)};
        Sort.sortFuel(taxis2);
        assertEquals(expected2, taxis2);

    }

    @Test
    public void testSortPrice() {
        TaxiStation.createTaxi();
        Taxi[] taxis1 = new Taxi[0];
        Taxi[] expected1 = new Taxi[0];
        Sort.sortFuel(taxis1);
        assertEquals(expected1, taxis1);


        Taxi[] taxis2 = TaxiStation.getTaxis();
        Taxi[] expected2 = {new Taxi("Volkswagen polo", 13500, 5, 1.6),
                new Taxi("Volkswagen polo", 10100, 5, 1.6),
                new Taxi("Volkswagen Sharan", 16000, 7, 2.0),
                new Taxi("BMW 5", 19000, 5, 4.4)};

        Sort.sortFuel(taxis2);
        assertEquals(expected2, taxis2);

    }

    @Test
    public void testSortCoast() {
        TaxiStation.createTaxi();
        Taxi[] taxis1 = new Taxi[0];
        Taxi[] expected1 = new Taxi[0];
        Sort.sortFuel(taxis1);
        assertEquals(expected1, taxis1);


        Taxi[] taxis2 = TaxiStation.getTaxis();
        Taxi[] expected2 = {new Taxi("Volkswagen polo", 13500, 5, 1.6),
                new Taxi("Volkswagen polo", 10100, 5, 1.6),
                new Taxi("Volkswagen Sharan", 16000, 7, 2.0),
                new Taxi("BMW 5", 19000, 5, 4.4)};
        Sort.sortFuel(taxis2);
        assertEquals(expected2, taxis2);

    }
}