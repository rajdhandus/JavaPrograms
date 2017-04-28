package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/27/17.
 */
public class Ford implements ICar, IPolishable{
    @Override
    public void driveForward() {
        System.out.println("Driving Ford forward!");
    }

    @Override
    public void driveBackward() {
        System.out.println("Driving Ford backward!");
    }

    @Override
    public void polish() {
        System.out.println("Polishing Ford");
    }
}
