package com.raj;

/**
 * Created by rajkumarpurushothaman on 5/2/17.
 */
public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I am not good at flying");
    }
}
