package com.raj;

import java.util.ArrayList;

/**
 * Created by rajkumarpurushothaman on 4/21/17.
 */
public class Bank {

    private String name;
    private ArrayList<Branch> branchArrayList;

    public Bank(String name) {
        this.name = name;
        this.branchArrayList = new ArrayList<Branch>();
    }

    public boolean addBranch(Branch theBranch) {
        return this.branchArrayList.add(theBranch);
    }

    public boolean addCustomer(Branch theBranch, Customer theCustomer) {
        int position = this.branchArrayList.indexOf(theBranch);
        return this.branchArrayList.get(position).addCustomer(theCustomer);
    }

    public boolean addTransaction(Branch theBranch, Customer theCustomer, double transaction) {
        int position = this.branchArrayList.indexOf(theBranch);
        return this.branchArrayList.get(position).addTransaction(theCustomer,transaction);
    }

    public void printAllCustomers(Branch theBranch, boolean includeTransactions) {
        int position = this.branchArrayList.indexOf(theBranch);
        this.branchArrayList.get(position).printAllCustomers(includeTransactions);
    }

}
