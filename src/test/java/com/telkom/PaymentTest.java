package com.telkom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {

    @Test
    public void testPaymentMethod() {

        Payment payment = new Payment("QRIS");

        assertEquals("QRIS", payment.getMethod());
    }

}