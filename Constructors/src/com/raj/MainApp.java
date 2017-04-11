package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/10/17.
 */
public class MainApp {

    public static void main(String[] args){
        VIPCustomer customer1 = new VIPCustomer();
        System.out.println(customer1.getName());

        VIPCustomer customer2 = new VIPCustomer("Raj", "raj@mail.com");
        System.out.println(customer2.getName());

        VIPCustomer customer3 = new VIPCustomer("Raj", 10000.0, "raj@ymail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailId());



    }
}
