package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/22/17.
 */
public class Customer {

    private String name;
    private String acctBalance;

    public Customer(String name, String acctBalance) {
        this.name = name;
        this.acctBalance = acctBalance;
    }

    public String getName() {
        return name;
    }

    public String getAcctBalance() {
        return acctBalance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcctBalance(String acctBalance) {
        this.acctBalance = acctBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", acctBalance='" + acctBalance + '\'' +
                '}';
    }

}
