package com.raj;

import java.util.ArrayList;

/**
 * Created by rajkumarpurushothaman on 4/21/17.
 */
public class Branch {

    private String name;
    private ArrayList<Customer> customerArrayList;

    public Branch(String name) {
        this.name = name;
        this.customerArrayList= new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public boolean addCustomer(Customer theCustomer) {
        return this.customerArrayList.add(theCustomer);
    }

    public boolean addTransaction(Customer theCustomer, double transaction) {
        int position = this.customerArrayList.indexOf(theCustomer);
        return this.customerArrayList.get(position).addTransactions(transaction);
    }

    public void printAllCustomers(boolean includeTransactions) {
        for (Customer theCustomer: customerArrayList) {
            System.out.println(theCustomer.getName());
            if(includeTransactions)
                theCustomer.printTransactions();
        }
    }
}
