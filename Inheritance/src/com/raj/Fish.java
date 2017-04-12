package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/11/17.
 */
public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int weight, int size, int gills, int eyes, int fins) {
        super(name, 1, 1, weight, size);
        this.eyes = eyes;
        this.gills = gills;
        this.fins = fins;
    }

    private void rest() {

    }

    public void moveMuscle() {

    }

    public void moveBackFin() {

    }

    private void swim() {
        moveMuscle();
        moveBackFin();
        super.move(3);
    }

}
