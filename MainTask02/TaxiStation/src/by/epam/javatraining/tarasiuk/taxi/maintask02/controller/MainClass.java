package by.epam.javatraining.tarasiuk.taxi.maintask02.controller;

import by.epam.javatraining.tarasiuk.taxi.maintask02.model.*;
import by.epam.javatraining.tarasiuk.taxi.maintask02.view.Printer;

import java.io.IOException;

public class MainClass {

    private static Taxi[] taxis = TaxiStation.getTaxis();

    public static void main(String[] args) throws IOException {
        TaxiStation.createTaxi();
        Sort.sortPrice(taxis);
        TaxiStation.Taxis();

        Taxi cheap = Search.searchCheap(taxis);
        Printer.print("Cheapest taxi: " + cheap.toString());
        Taxi expensive = Search.searchExpensive(taxis);
        Printer.print("Expensive taxi: " + expensive.toString());

        Order.readOrder();
        Taxi taxi = Order.createOrder();

        boolean flag = TaxiStation.checkOrder(taxi);
        if(flag) {
            Printer.print("Order is processed. From you " + taxi.getPrice() + " dollars");
        } else {
            Printer.print("Please, choose another car, this is busy");
        }
    }

}
