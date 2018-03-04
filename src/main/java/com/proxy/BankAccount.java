package com.proxy;

import java.math.BigDecimal;

public interface BankAccount {
    void withdraw(BigDecimal amount);
    void deposit(BigDecimal amount);
}
