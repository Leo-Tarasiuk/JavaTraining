package by.epam.javatraining.tarasiuk.taxi.maintask02.model;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TaxiStationTest {

    @Test
    public void testCheckOrder() {
        TaxiStation.createTaxi();

        Taxi taxis1 = new Taxi("Volkswagen polo", 12000, 6, 2.5);
        boolean expected1 = false;
        boolean flag1 = TaxiStation.checkOrder(taxis1);
        assertEquals(expected1, flag1);

        Taxi taxis2 = new Taxi("Volkswagen polo", 10100, 5, 1.6);
        boolean expected2 = true;
        boolean flag2 = TaxiStation.checkOrder(taxis2);
        assertEquals(expected2, flag2);

    }
}