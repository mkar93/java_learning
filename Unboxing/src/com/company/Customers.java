package com.company;

import java.util.ArrayList;

public class Customers {

    private String name;
    ArrayList<Double> transactions;

    public Customers(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public static Customers createCustomer(String name, ArrayList<Double> transactions){
        return new Customers(name,transactions);
    }
}
