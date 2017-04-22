package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/22/17.
 */
public class AppMain {

    public static void main(String[] args) {

        Customer firstCustomer = new Customer("Raj", "100");
        Customer secondCustomer = firstCustomer;

        secondCustomer.setAcctBalance("0");

        System.out.println(firstCustomer.toString());

    }
}
