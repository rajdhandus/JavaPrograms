package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/11/17.
 */
public class Vehicle {

    private String size;
    private String name;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String size, String name) {
        this.size = size;
        this.name = name;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Steering in the direction " + direction);
    }

    public void move(int speed, int direction) {
        this.currentVelocity += speed;
        this.currentDirection += direction;
        System.out.println("Moving at the speed of " + speed);
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity =0;
    }
}
