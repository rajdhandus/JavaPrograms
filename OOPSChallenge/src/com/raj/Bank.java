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
        if(findBranch(theBranch)!=null) {
            return findBranch(theBranch).addCustomer(theCustomer);

        }
        return false;
    }

    public boolean addTransaction(Branch theBranch, Customer theCustomer, double transaction) {
        if(findBranch(theBranch)!=null) {
            return findBranch(theBranch).addTransaction(theCustomer,transaction);

        }
        return false;
    }

    public void printAllCustomers(Branch theBranch, boolean includeTransactions) {
        if(findBranch(theBranch)!=null) {
            findBranch(theBranch).printAllCustomers(includeTransactions);
        }
    }

    public Branch findBranch(Branch theBranch) {
        int position =  this.branchArrayList.indexOf(theBranch);
        if(position>=0)
            return this.branchArrayList.get(position);
        else
            return null;
    }

}
