package com.raj;

public class Main {

    public static void main(String[] args) {
        Bank theBank = new Bank("BofA");

        Branch charlotteBranch = new Branch("Charlotte BofA");
        Branch raleighBranch = new Branch("Raleigh BofA");

        theBank.addBranch(charlotteBranch);
        theBank.addBranch(raleighBranch);

        Customer raj = new Customer("Raj",1000.0);
        Customer anu = new Customer("Anu",1000.0);
        Customer rajkumar = new Customer("Rajkumar",1000.0);
        Customer anuja = new Customer("Anuja",1000.0);

        charlotteBranch.addCustomer(raj);
        charlotteBranch.addCustomer(anu);
        charlotteBranch.addCustomer(rajkumar);
        charlotteBranch.addCustomer(anuja);

        raleighBranch.addCustomer(raj);
        raleighBranch.addCustomer(anu);
        raleighBranch.addCustomer(rajkumar);
        raleighBranch.addCustomer(anuja);

        charlotteBranch.addTransaction(raj,100);
        charlotteBranch.addTransaction(anu,200);
        charlotteBranch.addTransaction(rajkumar,300);
        charlotteBranch.addTransaction(anuja,400);

        charlotteBranch.addTransaction(raj,150);
        charlotteBranch.addTransaction(anu,250);
        charlotteBranch.addTransaction(rajkumar,350);
        charlotteBranch.addTransaction(anuja,450);

        charlotteBranch.printAllCustomers(true);

        raleighBranch.printAllCustomers(false);


    }
}
