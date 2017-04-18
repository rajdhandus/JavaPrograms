package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic", "Beef", 1, "white");
        double price = hamburger.itemizeBurger();
        hamburger.addAdditions1("tomato", .25);
        hamburger.addAdditions2("cheese", 1.12);
        hamburger.addAdditions3("lettuce", .75);
        price = hamburger.itemizeBurger();
        System.out.println("Total Price of the burger ->" + price);
    }
}
