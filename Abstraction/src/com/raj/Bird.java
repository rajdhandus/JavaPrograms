package com.raj;

/**
 * Created by rajkumarpurushothaman on 5/2/17.
 */
public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing in and out");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping");
    }
}
