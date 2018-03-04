package com.proxy;

public class Client {
    private BankAccount creditCard;

    public Client(BankAccount creditCard) {
        this.creditCard = creditCard;
    }

    public  BankAccount getCreditCard() {
        return creditCard;
    }
}
