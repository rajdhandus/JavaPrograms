package com.raj;

public class Main {

    public static void main(String[] args) {
        Account rajsAccount = new Account(123456789, 10000,
                "Rajkumar Purushothaman",
                "raj@mail.com", "909-348-1247");
        rajsAccount.withdrawFunds(100);
        rajsAccount.depositFunds(100);
        rajsAccount.withdrawFunds(50);
    }
}
