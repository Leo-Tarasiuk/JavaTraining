package by.epam.javatraining.tarasiuk.taxi.maintask02.model;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchTest {

    @Test
    public void testSearchCheap() {
        Taxi[] taxis1 = new Taxi[0];
        Taxi expected1 = null;
        Taxi cheap1 = Search.searchCheap(taxis1);
        assertEquals(expected1, cheap1);

        try {
            Taxi[] taxis2 = TaxiStation.getTaxis();
            Taxi expected2 = new Taxi("Volkswagen polo", 10100, 5, 1.6);
            Taxi cheap2 = Search.searchCheap(taxis2);
            assertEquals(expected2, cheap2);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSearchExpensive() {
        Taxi[] taxis1 = new Taxi[0];
        Taxi expected1 = null;
        Taxi expensive1 = Search.searchExpensive(taxis1);
        assertEquals(expected1, expensive1);

        try {
            Taxi[] taxis2 = TaxiStation.getTaxis();
            Taxi expected2 =  new Taxi("BMW 5", 19000, 5, 4.4);
            Taxi expensive2 = Search.searchExpensive(taxis2);
            assertEquals(expected2, expensive2);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSearchBig() {
        Taxi[] taxis1 = new Taxi[0];
        Taxi expected1 = null;
        Taxi big1 = Search.searchBig(taxis1);
        assertEquals(expected1, big1);

        try {
            Taxi[] taxis2 = TaxiStation.getTaxis();
            Taxi expected2 =  new Taxi("Volkswagen Sharan", 16000, 7, 2.0);
            Taxi big2 = Search.searchBig(taxis2);
            assertEquals(expected2, big2);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
