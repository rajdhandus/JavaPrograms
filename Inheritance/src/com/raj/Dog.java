package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/10/17.
 */
public class Dog extends Animal {

    private int legs;
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int weight, int size, int legs, int eyes, int tail, int teeth, String coat) {
        super(name, 1, 1, weight, size);
        this.legs = legs;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();
    }
}
