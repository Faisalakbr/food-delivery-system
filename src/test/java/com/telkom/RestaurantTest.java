package com.telkom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {

    @Test
    public void testRestaurantName() {

        Restaurant restaurant = new Restaurant("Ayam Geprek Telkom");

        assertEquals("Ayam Geprek Telkom", restaurant.getName());
    }

}