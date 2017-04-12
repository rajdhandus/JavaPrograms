package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/11/17.
 *
 * Car is-a Vehicle
 * is-a => Inheritance
 */
public class Car extends Vehicle {
    private int wheels;
    private int engineCapacity;

    public Car(String name, int wheels, int engineCapacity) {
        super(name);
        this.wheels = wheels;
        this.engineCapacity = engineCapacity;
    }
}
