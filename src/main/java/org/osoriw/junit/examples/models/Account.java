package org.osoriw.junit.examples.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Account {
    private String fullName;
    private BigDecimal balance;

}
