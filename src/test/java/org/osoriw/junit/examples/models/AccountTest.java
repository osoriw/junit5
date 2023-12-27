package org.osoriw.junit.examples.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testAccountName() {
        Account account = new Account("Andres", new BigDecimal("25600"));

        String expectedFullName = "Andres";
        String currentFullName = account.getFullName();

        assertEquals(expectedFullName, currentFullName);
    }

    @Test
    void testBalance() {
        Account account = new Account("Andres", new BigDecimal("25600"));

        String expectedBalance = "25600";
        BigDecimal currentBalance = account.getBalance();

        assertEquals(expectedBalance, currentBalance.toString());
        //dos formas distintas de probar la misma regla de negocio:
        assertFalse(currentBalance.compareTo(BigDecimal.ZERO) < 0);
        assertTrue(currentBalance.compareTo(BigDecimal.ZERO) > 0);
    }
}