package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/10/17.
 */
public class Account {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailId;
    private String phoneNumber;

    public Account(){
        //this should be the first line; can't have System.out.println up here!
        this(99999999, 0, "Default", "Default", "Default");
        //this is special; calls the other matching constructor; this should be the first line
        System.out.println("No Argument Constructor called");
    }

    public Account(int accountNumber, double accountBalance, String customerName, String emailId, String phoneNumber){
        //setAccountNumber(accountNumber);
        // can be done this way! BUT inheritance can cause issues
        // constructors should call only other constructors
        // other parts of initialization might not have completed. hence no guarantee that the setters would be ready
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        this.accountBalance += depositAmount;
        System.out.println("Amount of " + depositAmount + " has been deposited to the account number : " +
                this.accountNumber + "; New Balance - " + this.accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if(this.accountBalance>=withdrawalAmount){
            this.accountBalance -= withdrawalAmount;
            System.out.println("Amount of " + withdrawalAmount + " has been withdrawn from the account number : " +
                    this.accountNumber + "; New Balance - " + this.accountBalance);
        }
        else{
            System.out.println("Insufficient Balance in the account : " + this.accountNumber);
        }

    }
}
