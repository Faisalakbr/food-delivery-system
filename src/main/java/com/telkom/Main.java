package com.telkom;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Faisal", "Bandung");

        Restaurant restaurant = new Restaurant("Ayam Geprek Telkom");

        Menu menu = new Menu("Ayam Geprek", 25000);

        Driver driver = new Driver("Budi");

        Payment payment = new Payment("QRIS");

        Order order = new Order(customer, restaurant, menu, driver, payment);

        System.out.println(order.getOrderSummary());
    }
}
