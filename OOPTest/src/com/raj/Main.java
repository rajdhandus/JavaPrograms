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

        HealthyHamburger healthyHamburger = new HealthyHamburger("Bacon", 5.23);
        healthyHamburger.addAdditions1("Egg", 1.11);
        healthyHamburger.addHealthyExtra1("Sausage", 2.11);
        System.out.println("Total Price of the burger ->" + healthyHamburger.itemizeBurger());

        DeluxBurger deluxBurger = new DeluxBurger();
        System.out.println("Total Price of the burger ->" + deluxBurger.itemizeBurger());

    }
}
