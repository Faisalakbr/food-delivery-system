package com.telkom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void testOrderSummary() {

        Customer customer = new Customer("Faisal", "Bandung");
        Restaurant restaurant = new Restaurant("Ayam Geprek Telkom");
        Menu menu = new Menu("Ayam Geprek", 25000);
        Driver driver = new Driver("Budi");
        Payment payment = new Payment("QRIS");

        Order order = new Order(customer, restaurant, menu, driver, payment);

        assertEquals(
                "Faisal ordered Ayam Geprek from Ayam Geprek Telkom using QRIS delivered by Budi",
                order.getOrderSummary()
        );
    }
}