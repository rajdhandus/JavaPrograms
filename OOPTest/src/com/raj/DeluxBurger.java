package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/18/17.
 */
public class DeluxBurger extends Hamburger {

    public DeluxBurger() {
        super("Delux", "Chicken", 6.00, "White");
        super.addAdditions1("Chips", 1.0);
        super.addAdditions2("Drink", 1.0);
    }

    @Override
    public void addAdditions1(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }

    @Override
    public void addAdditions2(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }

    @Override
    public void addAdditions3(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }

    @Override
    public void addAdditions4(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }
}
