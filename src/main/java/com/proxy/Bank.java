package com.proxy;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static List<Client> clients;

    static {
        clients = new ArrayList<Client>();
        clients.add(new Client(new CreditCard())) ;
        clients.add(new Client(new CreditCard())) ;
        clients.add(new Client(new CreditCard())) ;
        clients.add(new Client(new CreditCard())) ;
        clients.add(new Client(new CreditCard())) ;
        clients.add(new Client(new CreditCard())) ;
    }
}
