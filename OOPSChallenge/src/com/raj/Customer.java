package com.raj;

import java.util.ArrayList;

/**
 * Created by rajkumarpurushothaman on 4/21/17.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addTransactions(double transactions) {
        return this.transactions.add(transactions);
    }

    public void printTransactions() {
        System.out.println(this.transactions.toString());
    }
}
