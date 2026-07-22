package com.telkom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuTest {

    @Test
    public void testMenuName() {

        Menu menu = new Menu("Ayam Geprek", 25000);

        assertEquals("Ayam Geprek", menu.getMenuName());
    }

    @Test
    public void testMenuPrice() {

        Menu menu = new Menu("Ayam Geprek", 25000);

        assertEquals(25000, menu.getPrice());
    }

}
