package com.proxy;

import java.math.BigDecimal;

public class CreditCard implements BankAccount {

    private BigDecimal money = BigDecimal.valueOf(100);

    public void withdraw(BigDecimal amount) {
        money = money.subtract(amount);
    }

    public void deposit(BigDecimal amount) {
        money = money.add(amount);
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
