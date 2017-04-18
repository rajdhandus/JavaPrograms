package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/18/17.
 */
public class HealthyHamburger extends Hamburger {

    private String extra1Name;
    private String extra2Name;
    private double extra1Price;
    private double extra2Price;

    public HealthyHamburger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown Rye");
    }

    public void addHealthyExtra1(String extra1Name, double extra1Price) {
        this.extra1Name = extra1Name;
        this.extra1Price = extra1Price;
    }

    public void addHealthyExtra2(String extra2Name, double extra2Price) {
        this.extra2Name = extra2Name;
        this.extra2Price = extra2Price;
    }

    @Override
    public double itemizeBurger() {
        double basePrice = super.itemizeBurger();

        if(extra1Name!=null) {
            basePrice += extra1Price;
            System.out.println("Added additional item " + extra1Name + "for an additional price of " + extra1Price);
        }

        if(extra2Name!=null) {
            basePrice += extra2Price;
            System.out.println("Added additional item " + extra2Name + "for an additional price of " + extra2Price);
        }

        return basePrice;
    }
}
