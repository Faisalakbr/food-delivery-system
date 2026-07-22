package com.telkom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverTest {

    @Test
    public void testDriverName() {

        Driver driver = new Driver("Budi");

        assertEquals("Budi", driver.getName());
    }

}