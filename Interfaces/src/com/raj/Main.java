package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ICar car = new BMW();
        car.driveBackward();
        car.driveForward();
        IPolishable polishable = (IPolishable) car;
        ((IPolishable) car).polish();

        car = new Ford();
        ((IPolishable) car).polish();
        car.driveForward();
        car.driveBackward();

    }
}
