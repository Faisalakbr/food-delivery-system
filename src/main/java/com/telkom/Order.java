package com.telkom;

public class Order {

    private Customer customer;
    private Restaurant restaurant;
    private Menu menu;
    private Driver driver;
    private Payment payment;

    public Order(Customer customer,
                 Restaurant restaurant,
                 Menu menu,
                 Driver driver,
                 Payment payment) {

        this.customer = customer;
        this.restaurant = restaurant;
        this.menu = menu;
        this.driver = driver;
        this.payment = payment;
    }

    public String getOrderSummary() {
        return customer.getName()
                + " ordered "
                + menu.getMenuName()
                + " from "
                + restaurant.getName()
                + " using "
                + payment.getMethod()
                + " delivered by "
                + driver.getName();
    }
}
