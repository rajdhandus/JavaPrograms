package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/27/17.
 */
public class BMW implements ICar, IPolishable{

    @Override
    public void driveForward() {
        System.out.println("Driving BMW forward!");
    }

    @Override
    public void driveBackward() {
        System.out.println("Driving BMW backwards");
    }

    @Override
    public void polish() {
        System.out.println("Polishing BMW");
    }
}
