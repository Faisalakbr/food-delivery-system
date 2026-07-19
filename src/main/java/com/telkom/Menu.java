package com.telkom;

public class Menu {

    private String menuName;
    private double price;

    public Menu(String menuName, double price) {
        this.menuName = menuName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public double getPrice() {
        return price;
    }
}