package com.telkom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    public void testCustomerName() {
        Customer customer = new Customer("Faisal", "Bandung");

        assertEquals("Faisal", customer.getName());
    }

    @Test
    public void testCustomerAddress() {
        Customer customer = new Customer("Faisal", "Bandung");

        assertEquals("Bandung", customer.getAddress());
    }
}