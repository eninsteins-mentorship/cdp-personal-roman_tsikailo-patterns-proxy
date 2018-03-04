package com.proxy;


import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_DOWN;

public class PlasticCreditCardProxy extends CreditCard {

    private CreditCard creditCard;

    public PlasticCreditCardProxy(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void withdraw(BigDecimal amount) {
        takePercent(amount);
        super.withdraw(amount);
    }

    @Override
    public void deposit(BigDecimal amount) {
        takePercent(amount);
        super.deposit(amount);
    }

    private void takePercent(BigDecimal amount) {
        creditCard.setMoney(amount.divide(BigDecimal.valueOf(100), ROUND_HALF_DOWN));
    }
}
