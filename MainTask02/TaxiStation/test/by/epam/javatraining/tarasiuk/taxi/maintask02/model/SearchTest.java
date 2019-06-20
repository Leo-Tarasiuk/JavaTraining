package by.epam.javatraining.tarasiuk.taxi.maintask02.model;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchTest {

    @Test
    public void testSearchCheap() {
        TaxiStation.createTaxi();
        Taxi[] taxis1 = new Taxi[0];
        Taxi expected1 = null;
        Taxi cheap1 = Search.searchCheap(taxis1);
        assertEquals(expected1, cheap1);

        Taxi[] taxis2 = TaxiStation.getTaxis();
        Taxi expected2 = new Taxi("Volkswagen polo", 10100, 5, 1.6);
        Taxi cheap2 = Search.searchCheap(taxis2);
        assertEquals(expected2, cheap2);

    }

    @Test
    public void testSearchExpensive() {
        TaxiStation.createTaxi();
        Taxi[] taxis1 = new Taxi[0];
        Taxi expected1 = null;
        Taxi expensive1 = Search.searchExpensive(taxis1);
        assertEquals(expected1, expensive1);

        Taxi[] taxis2 = TaxiStation.getTaxis();
        Taxi expected2 = new Taxi("BMW 5", 19000, 5, 4.4);
        Taxi expensive2 = Search.searchExpensive(taxis2);
        assertEquals(expected2, expensive2);
    }

    @Test
    public void testSearchBig() {
        TaxiStation.createTaxi();
        Taxi[] taxis1 = new Taxi[0];
        Taxi expected1 = null;
        Taxi big1 = Search.searchBig(taxis1);
        assertEquals(expected1, big1);

        Taxi[] taxis2 = TaxiStation.getTaxis();
        Taxi expected2 = new Taxi("Volkswagen Sharan", 16000, 7, 2.0);
        Taxi big2 = Search.searchBig(taxis2);
        assertEquals(expected2, big2);
    }
}