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

    public ArrayList<Customer> getCustomers() {
        return customerArrayList;
    }

    public boolean addCustomer(Customer theCustomer) {
        if(findCustomer(theCustomer)!=null)
            return false;
        else
            return this.customerArrayList.add(theCustomer);
    }

    public boolean addTransaction(Customer theCustomer, double transaction) {
        if(findCustomer(theCustomer)!=null)
            return findCustomer(theCustomer).addTransactions(transaction);
        else
            return false;
    }

    public Customer findCustomer(Customer theCustomer) {
        int position = this.customerArrayList.indexOf(theCustomer);
        if(position>=0)
            return this.customerArrayList.get(position);
        else
            return null;
    }

    public void printAllCustomers(boolean includeTransactions) {
        for (Customer theCustomer: customerArrayList) {
            System.out.println(theCustomer.getName());
            if(includeTransactions)
                theCustomer.printTransactions();
        }
    }
}
