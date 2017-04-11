package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/10/17.
 */
public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String emailId;

    public VIPCustomer() {
        this("Default Name", 0.0,"default@noreply.com");
    }

    public VIPCustomer(String name) {
        this(name, 10000.0, "default@noreply.com");
    }

    public VIPCustomer(String name, String emailId) {
        this(name, 10000.0,emailId);
    }

    public VIPCustomer(String name, double creditLimit, String emailId) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }
}
