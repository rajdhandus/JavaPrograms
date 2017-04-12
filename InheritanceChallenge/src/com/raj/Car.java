package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/11/17.
 */
public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String size, String name, int wheels, int doors, int gears, boolean manual) {
        super(size, name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = manual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Current Gear changed to " + currentGear);
    }

    public void changeSpeed(int speed, int direction) {
        move(speed, direction);
        System.out.println("Changing the speed to " + speed + " and the direction to " + direction);
    }

    @Override
    public void stop() {
        super.stop();
    }
}
