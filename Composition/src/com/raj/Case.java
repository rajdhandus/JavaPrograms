package com.raj;


/**
 * Created by rajkumarpurushothaman on 4/11/17.
 */
public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimentions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimentions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimentions = dimentions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed!");
    }
}
