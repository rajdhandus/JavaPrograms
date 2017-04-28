package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/27/17.
 */
public class BMW implements ICar {

    @Override
    public void driveForward() {
        System.out.println("Driving the vehicle forward!");
    }

    @Override
    public void driveBackward() {
        System.out.println("Driving it backwards");
    }
}
